package GroceryList;


import java.util.Scanner;

public class GroceryItemsInputReader{

    Scanner in = new Scanner (System.in);

    public GroceryItems readItem() {

        System.out.println("Do you wish to add a product to the list? Please enter y or n.");
        String newProductAnswer = in.nextLine().toLowerCase().trim();
        switch (newProductAnswer) {
            case "y":
                String productName = getItemInput();
                GroceryItems product = getQuantityAndType(productName);
                return product;
            case "n":
                return null;
            default:
                System.out.println("Your input cannot be processed.");
                return readItem();

        }
    }

        public String getItemInput(){
            System.out.println("Please enter the name of the product.");
            String input = in.nextLine().trim();

            if (input.length() != 0) {
                return input;
            }

            System.out.print("The input seems to be empty.");
            return getItemInput();
        }

    public GroceryItems getQuantityAndType(String productName) {
        //Quantity and Type are entered as one string and then split (space between amount and type of amount)
        System.out.println("Please enter the amount and the type of amount of the product (grams, kilograms, millilitre," +
                " litre, piece, pieces).\r\n" + "If you only want to add a name without any amount, simply enter two spaces.");
        String input = in.nextLine();
        if (input.equals("  ")){
            return createProductWithName(productName);
        }
        String[] fragments = input.trim().split(" ");

        //error message if more than two 'things' are entered
        if (fragments.length != 2) {
            System.out.println("The input is not correct. Please try again. Error: Only two entries are allowed " +
                    "(amount and type of amount).");
            getQuantityAndType(productName);

        }

        double quantity = getQuantityFromInput(fragments[0]);
        GroceryItems.ProductType type = checkAmountEnding(fragments[1]);
        changeAmount(quantity, type);
        return createProduct(productName, quantity, type);


    }



    public double getQuantityFromInput(String input) {
        try {
            if (input.equals(" ")){
                double emptyInput = Double.NaN;
                return emptyInput;
            }
            double inputInDouble = Double.parseDouble(input);
            if (inputInDouble == 0){
                System.out.println("The amount entered cannot be used. Please enter a number that is larger than 0.");
                return getQuantityFromInput(in.nextLine());
            }
            return inputInDouble;
        } catch (Exception e) {
            System.out.print("The amount entered is not a number. Please enter a number.\n\r");
            return getQuantityFromInput(in.nextLine());
        }

    }


    public GroceryItems.ProductType checkAmountEnding(String ending) {
        GroceryItems.ProductType type = null;
        ending = ending.trim().toLowerCase();
        switch (ending) {
            case "grams":
                type = GroceryItems.ProductType.GRAMS;
                return type;
            case "kilograms":
                type = GroceryItems.ProductType.KILOGRAMS;
                return type;
            case "millilitre":
                type = GroceryItems.ProductType.MILLILITRE;
                return type;
            case "litre":
                type = GroceryItems.ProductType.LITRE;
                return type;
            case "piece":
                type = GroceryItems.ProductType.PIECE;
                return type;
            case "pieces":
                type = GroceryItems.ProductType.PIECES;
                return type;
            case "nothing":
                type = GroceryItems.ProductType.EMPTY;
                return type;
            default:
                System.out.println("The type of amount entered is not available. Please re-enter your input (grams, " +
                        "kilograms, millilitre, litre, piece, pieces).");
                String newEnding = in.nextLine();
                return checkAmountEnding(newEnding);
        }
    }


    public void changeAmount(double amountValue, GroceryItems.ProductType type){
            if ((type == GroceryItems.ProductType.KILOGRAMS) ||(type == GroceryItems.ProductType.LITRE)){
                amountValue = amountValue * 1000;
            }
    }

    public GroceryItems createProduct(String name, double amount, GroceryItems.ProductType type){
        GroceryItems product = new GroceryItems(name, amount, type);
        return product;
    }

    public GroceryItems createProductWithName (String name){
        GroceryItems product = new GroceryItems(name);
        return product;
    }


}


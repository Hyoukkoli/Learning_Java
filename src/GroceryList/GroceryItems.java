package GroceryList;


public class GroceryItems{

    private String productName;
    private double sizeOfProduct;
    private ProductType type;

    public enum ProductType {
        GRAMS,
        KILOGRAMS,
        MILLILITRE,
        LITRE,
        PIECE,
        PIECES;


        public static String getEnding(ProductType type){
            switch(type){
                case GRAMS: return "g";
                case KILOGRAMS: return "kg";
                case MILLILITRE: return "ml";
                case LITRE: return "l";
                case PIECE: return "pc";
                case PIECES: return "pcs";
            }
            return null;
        }
    }


    public GroceryItems(String name, double size, ProductType type){
        this.productName = name;
        this.sizeOfProduct = size;
        this.type = type;
    }

    public String getProductName(){
        return this.productName;
    }

    public double getSizeOfProduct(){
        return this.sizeOfProduct;
    }

    public ProductType getType() {
        return this.type;
    }





}

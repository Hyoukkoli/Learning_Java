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
        PIECES,
        EMPTY,

    }

    //constructor for products with only a name (e.g. spices and stuff like that, or if you only want to add a name)
    public GroceryItems(String name){
        this.productName = name;
        sizeOfProduct = 0;
        type = ProductType.EMPTY;
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

    public void setSizeOfProduct(double newAmount){
        sizeOfProduct = newAmount;
    }

    public ProductType getType() {
        return this.type;
    }

    public void setType(ProductType type){
        this.type = type;
    }

    public String getEnding(ProductType type){
        switch(type){
            case GRAMS: return "g";
            case KILOGRAMS: return "kg";
            case MILLILITRE: return "ml";
            case LITRE: return "l";
            case PIECE: return "pc";
            case PIECES: return "pcs";
            case EMPTY: return "";
        }
        return null;
    }





}

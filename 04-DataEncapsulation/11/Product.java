public class Product {
    
    private String productName;
    private boolean isVegetarian;

    public String getProductName() {
        return this.productName;
    }

    public boolean getIsVegetarian() {
        return this.isVegetarian;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public String toString() {
        return "Product \"" + this.getProductName() + "\" is " + (this.getIsVegetarian() ? "" : "not ") + "vegetarian.";
    }
}

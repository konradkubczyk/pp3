public class Product {
    private String name;
    private double price;
    private String description;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String name, double price, String description, String category) {
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
        this.setCategory(category);
    }

    public String toString() {
        return this.getName() + " " + this.getPrice() + " " + this.getDescription() + " " + this.getCategory();
    }
}

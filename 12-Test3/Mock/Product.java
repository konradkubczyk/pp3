public class Product implements Comparable<Product> {
    String name;
    float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name + " " + this.price;
    }
}

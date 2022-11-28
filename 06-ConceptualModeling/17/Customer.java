import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private ArrayList<Product> purchasedProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchaseProducts(ArrayList<Product> purchaseProducts) {
        this.purchasedProducts = purchaseProducts;
    }

    public Customer(String name, String surname, ArrayList<Product> purchaseProducts) {
        this.setName(name);
        this.setSurname(surname);
        this.setPurchaseProducts(purchaseProducts);
    }

    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product) {
        purchasedProducts.remove(product);
    }

    public String getListOfProducts() {
        String listOfProducts = "Products:";
        for (Product product : purchasedProducts) {
            listOfProducts += "\n - " + product;
        }
        return listOfProducts;
    }
}

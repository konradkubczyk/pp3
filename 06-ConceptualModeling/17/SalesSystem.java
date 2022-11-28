import java.util.ArrayList;

public class SalesSystem {
    public static void main(String[] args) {
        // Create a seller
        Seller seller = new Seller("Bob & Co.", "123 Main Street", "000-123-4567", "mail@example.com", new ArrayList<Customer>());

        // Create a customer
        Customer customer = new Customer("John", "Doe", new ArrayList<Product>());

        // Add the customer to the seller's list of customers
        seller.addCustomer(customer);

        // Create a product
        Product product = new Product("Apple", 1.99, "A delicious apple.", "fruits");

        // Add the product to the customer's list of purchased products
        customer.addProduct(product);

        // Print the customer
        System.out.println(customer + "\n");

        // Print the customer's purchased products
        System.out.println(customer.getListOfProducts() + "\n");

        // Print the seller
        System.out.println(seller + "\n");

        // Print the seller's customers
        System.out.println(seller.getListOfCustomers());
    }
}

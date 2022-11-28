import java.util.ArrayList;

public class Seller {
    private String name;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Seller(String name, String address, String phone, String email, ArrayList<Customer> customers) {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
        this.setCustomers(customers);
    }

    public String toString() {
        return this.getName() + " " + this.getAddress() + " " + this.getPhone() + " " + this.getEmail();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public String getListOfCustomers() {
        String listOfCustomers = "Customers:";
        for (Customer customer : customers) {
            listOfCustomers += "\n - " + customer;
        }
        return listOfCustomers;
    }
}

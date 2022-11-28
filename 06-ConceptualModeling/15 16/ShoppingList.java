import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    class Item {
        private String name;
        private int quantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.trim().length() == 0) {
                throw new IllegalArgumentException("Name cannot be empty!");
            }
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative!");
            }
            this.quantity = quantity;
        }

        public Item(String name, int quantity) {
            this.setName(name);
            this.setQuantity(quantity);
        }
    }

    private ArrayList<Item> items;

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ShoppingList() {
        items = new ArrayList<Item>();
    }

    public ShoppingList(ArrayList<Item> items) {
        this.setItems(items);
    }

    public void addItem(String name, int quantity) {
        items.add(new Item(name, quantity));
    }

    public void removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Item " + name + " not found!");
    }

    public int getProductCount() {
        int productCount = 0;
        for (int i = 0; i < items.size(); i++) {
            productCount += items.get(i).getQuantity();
        }
        return productCount;
    }

    public String toString() {
        String resultString = "";
        if (items.size() == 0) {
            resultString += "Shopping list is empty";
        } else {
            resultString += "Shopping list:";
            for (int i = 0; i < items.size(); i++) {
                resultString += "\n - " + items.get(i).getName() + " (" + items.get(i).getQuantity() + ")";
            }
        }
        return resultString;
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        System.out.println(shoppingList);
        System.out.println();
        System.out.println("Number of products: " + shoppingList.getProductCount());
        System.out.println();
        shoppingList.addItem("Chocolate", 2);
        shoppingList.addItem("Orange juice", 3);
        shoppingList.addItem("Flour", 1);
        System.out.println(shoppingList);
        System.out.println();
        System.out.println("Number of products: " + shoppingList.getProductCount());
        System.out.println();
        shoppingList.addItem("Oil", 1);
        System.out.println(shoppingList);
        System.out.println();
        System.out.println("Number of products: " + shoppingList.getProductCount());
        System.out.println();
        shoppingList.removeItem("Chocolate");
        System.out.println(shoppingList);
        System.out.println();

        System.out.println("Creating custom shopping list...");
        shoppingList = new ShoppingList(new ArrayList<Item>());
        // Allow user to input items from console
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter item name (empty to finish): ");
            String name = scanner.nextLine();
            if (name.trim().length() == 0) {
                break;
            }
            System.out.print("Enter item quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            shoppingList.addItem(name, quantity);
        }
        scanner.close();

        System.out.println();
        System.out.println(shoppingList);
        System.out.println();
        System.out.println("Number of products: " + shoppingList.getProductCount());
    }
}

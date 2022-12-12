import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> products = new ArrayList<Product>();

    public void add(Product product) {
        this.products.add(product);
    }

    public String toString() {
        String result = "";
        
        if (products.size() > 0) {
            result += products.get(0).getName();

            if (products.size() > 1) {
                for (int i = 1; i < products.size(); i++) {
                    result += "," + products.get(i).getName();
                }
            }
        }
        
        return result;
    }

    public int total() {
        int totalCount = 0;
        
        for (Product product : products) {
            totalCount += product.getQuantity();
        }
        
        return totalCount;
    }
}

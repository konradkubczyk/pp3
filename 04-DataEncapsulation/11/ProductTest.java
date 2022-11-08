public class ProductTest {
    
    public static void main(String[] args) {
        
        Product product1 = new Product();

        product1.setProductName("Cookies");
        product1.setIsVegetarian(true);

        System.out.println(product1);

        Product product2 = new Product();

        product2.setProductName("Beef");
        product2.setIsVegetarian(false);

        System.out.println(product2);
    }
}

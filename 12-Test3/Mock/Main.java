import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("anna", "may");
        System.out.println("\n" + person);

        System.out.println("\n" + Isogram.isogram("red sun"));
        System.out.println(Isogram.isogram("blue water"));
        System.out.println(Isogram.isogram("BLUE water"));
        System.out.println(Isogram.isogram("my blue water"));

        Logic logic1 = new Logic(new boolean[] {true, false, false});
        System.out.println("\n" + logic1.opposite());
        Logic logic2 = new Logic(new boolean[] {true, false, true, false});
        System.out.println(logic2.opposite());
        Logic logic3 = new Logic(new boolean[] {true, false, true, true, false, true, false, true, false});
        System.out.println(logic3.opposite());

        Number number = new Number();
        number.setSystem(5);
        number.setValue("101");
        System.out.println("\n" + number.get10());
        number.setSystem(8);
        number.setValue("10283");
        System.out.println(number.get10());

        Cities cities = new Cities(new String[] {"Warszawa", "Sopot", "Kielce", "Szczecin"});
        System.out.println("\n" + cities.cities());
        System.out.println(cities.filter('S').cities());

        Pizza pizza = new Pizza("Margeritta", 64);
        pizza.setPrice();
        System.out.println("\n" + pizza.getPrice());
        System.out.println(pizza.discount());
        System.out.println(pizza.delivery());
        System.out.println(pizza.delivery(3));

        Numbers numbers1 = new Numbers(new int[] {6, 7, 6, 1, 4});
        System.out.println("\n" + numbers1.ok());
        Numbers numbers2 = new Numbers(new int[] {2, 5, 2, 8, 4});
        System.out.println(numbers2.ok());
    
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Milk", 2.5f));
        products.add(new Product("Bread", 1.5f));
        products.add(new Product("Eggs", 3.5f));
        products.add(new Product("Butter", 4.5f));
        System.out.println("\n" + products);
        products.sort(Comparator.comparing(Product::getName));
        System.out.println(products);
    }
}

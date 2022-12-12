public class Main {
    public static void main(String[] args) {
        System.out.println("\nNumbers");
        Numbers numbers1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(numbers1.different());
        Numbers numbers2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(numbers2.different());

        System.out.println("\nArrays");
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(Arrays.arr(arr1, arr2));

        System.out.println("\nFamily");
        Family family = new Family(new Person[] {new Person("Bob", 36), new Person("Alice", 34), new Person("Joe", 7)});
        System.out.println(family.adults());

        System.out.println("\nShoppingList");
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new Product("milk", 2));
        shoppingList.add(new Product("apple", 4));
        System.out.println(shoppingList);
        System.out.println(shoppingList.total());

        System.out.println("\nSuperCounter");
        SuperCounter superCounter = new SuperCounter(5);
        superCounter.add1();
        superCounter.add1();
        superCounter.addN(3);
        System.out.println(superCounter.getCounter());

        System.out.println("\nCar");
        Car car = new Car(4, 230);
        System.out.println(java.util.Arrays.toString(car.spec()));
    }
}

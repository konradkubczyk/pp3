import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        
        System.out.println("\nNumbers");
        int[] numbers1 = {-1, -10, 1};        
        System.out.println(Numbers.m(numbers1));
        int[] numbers2 = {4, 5, 3, -1, -3};
        System.out.println(Numbers.m(numbers2));
        int[] numbers3 = {2, -2};
        System.out.println(Numbers.m(numbers3));
        int[] numbers4 = {0};
        System.out.println(Numbers.m(numbers4));

        System.out.println("\nFilename");
        Filename filename1 = new Filename("myprogram.c");
        System.out.println(filename1.m1());
        System.out.println(filename1.m2());
        Filename filename2 = new Filename("data.csv");
        System.out.println(filename2.m1());
        System.out.println(filename2.m2());
        Filename filename3 = new Filename("Test 1.2.3.zip");
        System.out.println(filename3.m1());
        System.out.println(filename3.m2());

        System.out.println("\nCompetition");
        int[] scores1 = {4, 5, 3, 3, 5, 2, 2, 4};
        Competition competition1 = new Competition(scores1);
        System.out.println(competition1.m());
        int[] scores2 = {1, 3, 2, 4};
        Competition competition2 = new Competition(scores2);
        System.out.println(competition2.m());

        System.out.println("\nWords");
        String[] w1 = {"university", "semester", "student"};
        Words words1 = new Words(w1);
        System.out.println(words1.m());
        String[] w2 = {"mouse", "computer", "mouse", "printer"};
        Words words2 = new Words(w2);
        System.out.println(words2.m());

        System.out.println("\nFamily");
        Person p1 = new Person("Bob", 37);
        Person p2 = new Person("Alice", 34);
        Person p3 = new Person("Mike", 7);
        Family family = new Family();
        family.add(p1);
        family.add(p2);
        family.add(p3);
        System.out.println(family.adults());

        System.out.println("\nCar");
        Car car = new Car(4, 200);
        System.out.println(Arrays.toString(car.spec()));
    }
}

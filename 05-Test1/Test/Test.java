public class Test {
    public static void main(String[] args) {

        boolean[] failArray = new boolean[4];

        // Exercise 1: Point.java
        Point point = new Point(3, 0);
        if (point.isX() != true) {
            System.out.println("1\tPoint.isX()\t\tFAIL");
            failArray[0] = true;
        }
        if (point.isY() != false) {
            System.out.println("1\tPoint.isY()\t\tFAIL");
            failArray[0] = true;
        }
        if (!point.toString().equals("P(3,0)")) {
            System.out.println("1\tPoint.toString()\t\tFAIL");
            failArray[0] = true;
        }
        if (!failArray[0]) {
            System.out.println("1\tPoint.java\t\tPASS");
        }

        // Exercise 2: Book.java
        Book book = new Book();
        book.setTitle("Test Book");
        book.setPages(10);
        if (book.getTitle() != "Test Book") {
            System.out.println("2\tBook.getTitle()\t\tFAIL");
            failArray[1] = true;
        }
        if (book.getPages() != 10) {
            System.out.println("2\tBook.getPages()\t\tFAIL");
            failArray[1] = true;
        }
        book.setPages(-5);
        if (book.getPages() != 10) {
            System.out.println("2\tBook.setPages()\t\tFAIL");
            failArray[1] = true;
        }
        if (!failArray[1]) {
            System.out.println("2\tBook.java\t\tPASS");
        }

        // Exercise 3: MyArrays.java
        if (MyArrays.odd(new int[] {1, 2, 3, 4, 5}) != 3) {
            System.out.println("3\tMyArrays.odd()\t\tFAIL");
            failArray[2] = true;
        }
        if (MyArrays.above(new int[] {1, 2, 3, 4, 5}) != 9) {
            System.out.println("3\tMyArrays.above()\t\tFAIL");
            failArray[2] = true;
        }
        if (!failArray[2]) {
            System.out.println("3\tMyArrays.java\t\tPASS");
        }

        // Exercise 4: Clock.java
        Clock clock = new Clock(22, 59);
        if (clock.getHour() != 22 || clock.getMinute() != 59) {
            System.out.println("4\tClock.getHour()\t\tFAIL");
            failArray[3] = true;
        }
        clock.addMinute();
        if (clock.getHour() != 23 || clock.getMinute() != 0) {
            System.out.println("4\tClock.addMinute()\t\tFAIL");
            failArray[3] = true;
        }
        clock.setMinute(59);
        if (clock.getHour() != 23 || clock.getMinute() != 59) {
            System.out.println("4\tClock.setMinute()\t\tFAIL");
            failArray[3] = true;
        }
        clock.addMinute();
        if (clock.getHour() != 0 || clock.getMinute() != 0) {
            System.out.println("4\tClock.addMinute()\t\tFAIL");
            failArray[3] = true;
        }
        if (!failArray[3]) {
            System.out.println("4\tClock.java\t\tPASS");
        }

        // Summary
        if (!failArray[0] && !failArray[1] && !failArray[2] && !failArray[3]) {
            System.out.println("\nAll tests passed!");
        }
    }
}
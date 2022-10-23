public class Counter {
    
    // Attributes
    int value = 0;

    // Methods
    public void increaseBy1() {
        value += 1;
        System.out.println("Value increased by 1 from " + (value - 1) + " to " + value);
    }

    public void decreaseBy1() {
        value -= 1;
        System.out.println("Value decreased by 1 from " + (value + 1) + " to " + value);
    }

    public void increaseBy10() {
        value += 10;
        System.out.println("Value increased by 10 from " + (value - 10) + " to " + value);
    }

    public void decreaseBy10() {
        value -= 10;
        System.out.println("Value decreased by 10 from " + (value + 10) + " to " + value);
    }

    public void displayValue() {
        System.out.println("Current value of the counter is " + value);
    }

    public void resetCounter() {
        value = 0;
        System.out.println("Value of the counter has been reset to 0");
    }

    public static void main(String[] args) {
        
        // First counter
        Counter counter1 = new Counter();

        counter1.increaseBy1();

        counter1.resetCounter();
        
        for (int i = 0; i < 2; i++) {
            counter1.increaseBy10();
        }

        for (int i = 0; i < 3; i++) {
            counter1.increaseBy1();
        }

        counter1.displayValue();

        System.out.println();

        // Second counter
        Counter counter2 = new Counter();

        for (int i = 0; i < 4; i++) {
            counter2.decreaseBy10();
        }

        for (int i = 0; i < 7; i++) {
            counter2.decreaseBy1();
        }

        counter2.displayValue();
    }
}

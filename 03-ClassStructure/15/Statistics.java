public class Statistics {
    
    public int numberOfItemsInRange(int start, int end) {
        return end - start + 1;
    }

    public int sumOfNumbersInRange(int start, int end) {
        
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public double meanOfNumbersInRange(int start, int end) {
        return (double)this.sumOfNumbersInRange(start, end) / this.numberOfItemsInRange(start, end);
    }

    public static void main(String[] args) {

        Statistics statistics = new Statistics();

        System.out.println("Number of items within <5, 10>: " + statistics.numberOfItemsInRange(5, 10));
        System.out.println("Sum of numbers within <5, 10>: " + statistics.sumOfNumbersInRange(5, 10));
        System.out.println("Arithmetic mean of numbers within <5, 10>: " + statistics.meanOfNumbersInRange(5, 10));
    }

}

public class Numbers implements Ok {
    int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean ok() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != i % 2) {
                return false;
            }
        }

        return true;
    }
}

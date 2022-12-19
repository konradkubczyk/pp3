public class Numbers {
    public static boolean m(int[] numbers) {
        int positiveAbsSum = 0;
        int negativeAbsSum = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveAbsSum += number;
            } else {
                negativeAbsSum += number * -1;
            }
        }

        return positiveAbsSum > negativeAbsSum;
    }
}
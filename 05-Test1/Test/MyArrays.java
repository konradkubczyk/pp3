public class MyArrays {
    public static int odd(int[] array) {
        int positiveOddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 != 0) {
                positiveOddCount++;
            }
        }

        return positiveOddCount;
    }

    public static int above(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        float average = (float)sum / (float)array.length;

        int aboveAverageSum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((float)array[i] > average) {
                aboveAverageSum += array[i];
            }
        }

        return aboveAverageSum;
    }
}

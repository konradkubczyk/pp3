public class Arrays {
    private static int countDoubleDigits(int[] array) {
        int doubleDigitCount = 0;

        for (int integer : array) {
            if (Integer.toString(integer).length() == 2) {
                doubleDigitCount++;
            }
        }

        return doubleDigitCount;
    }

    public static Boolean arr(int[] arr1, int[] arr2) {
        return countDoubleDigits(arr1) == countDoubleDigits(arr2);
    }
}

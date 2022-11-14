public class MyArrays {
    public static int even(int[] array) {
        int evenCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static int positiveOdd(int[] array) {
        int positiveOddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 1) {
                positiveOddCount++;
            }
        }

        return positiveOddCount;
    }

    public static void main(String[] args) {
        System.out.println(MyArrays.even(new int[] {2,-6,5,8}));
        System.out.println(MyArrays.positiveOdd(new int[] {3,2,-5,4,1,-7}));
    }
}

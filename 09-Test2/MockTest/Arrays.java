public class Arrays {
    public static Boolean arr(int[] arr1, int[] arr2) {
        int arr1Count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (Integer.toString(arr1[i]).length() == 2) {
                arr1Count++;
            }
        }

        int arr2Count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (Integer.toString(arr2[i]).length() == 2) {
                arr2Count++;
            }
        }

        return arr1Count == arr2Count;
    }
}

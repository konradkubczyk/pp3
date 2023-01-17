public class P {
    public static String m(int n) {
        String output = "";

        for (int i = 0; i < n / 100; i++) {
            output += "*";
        }

        n = n % 100;

        for (int i = 0; i < n / 10; i++) {
            output += "+";
        }

        n = n % 10;

        for (int i = 0; i < n; i++) {
            output += "/";
        }

        return output;
    }
}

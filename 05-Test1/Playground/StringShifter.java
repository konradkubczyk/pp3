public class StringShifter {

    public static char[] stringToArray(String string) {

        char[] charArray = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }

    public static boolean everyLetterAppearsTwice(String text) {

        for (char character = 'a'; character <= 'z'; character++) {

            int letterCount = 0;

            for (int index = 0; index < text.length(); index++) {
                if (text.charAt(index) == character) {
                    letterCount++;
                }
            }

            if (letterCount != 0 && letterCount != 2) {
                return false;
            }
        }

        return true;
    }
}

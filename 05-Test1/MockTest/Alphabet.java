public class Alphabet {
    public static boolean isAlphabet(String t) {
        for (int i = 1; i < t.length(); i++) {
            if (Character.toLowerCase(t.charAt(i)) - Character.toLowerCase(t.charAt(i-1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("aAbegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}

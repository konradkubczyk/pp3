import java.util.ArrayList;

public class Isogram {
    public static boolean isogram(String text) {
        ArrayList<Character> characters = new ArrayList<Character>();

        for (int i = 0; i < text.length(); i++) {
            if (characters.contains(text.charAt(i))) {
                return false;
            }
            characters.add(text.charAt(i));
        }

        return true;
    }
}

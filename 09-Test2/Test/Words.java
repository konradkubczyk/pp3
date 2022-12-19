public class Words {
    private String[] words;

    public Words(String[] words) {
        this.words = words;
    }

    public boolean m() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i] == words[j] && i != j) {
                    return true;
                }
            }
        }

        return false;
    }
}

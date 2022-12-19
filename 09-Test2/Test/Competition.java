public class Competition {
    private int[] scores;

    public Competition(int[] scores) {
        this.scores = scores;
    }

    public int m() {
        int min = scores[0];
        int max = min;
        int sum = 0;

        for (int score : scores) {
            sum += score;

            if (score < min) {
                min = score;
            } else if (score > max) {
                max = score;
            }
        }

        return sum - min - max;
    }
}

public class CompetitionScoringSystem {
    private static int[] allowedScores = { 1, 2, 3, 4, 5 };
    private int[] scores;

    public static int[] getAllowedScores() {
        return allowedScores;
    }

    public static void setAllowedScores(int[] allowedScores) {
        CompetitionScoringSystem.allowedScores = allowedScores;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (!isAllowedScore(scores[i])) {
                throw new IllegalArgumentException("Score " + scores[i] + " is not allowed!");
            }
        }
        this.scores = scores;
    }

    public CompetitionScoringSystem() {}

    public CompetitionScoringSystem(int[] scores) {
        this.setScores(scores);
    }

    private boolean isAllowedScore(int score) {
        for (int i = 0; i < allowedScores.length; i++) {
            if (allowedScores[i] == score) {
                return true;
            }
        }
        return false;
    }

    public double calculateResult() {
        int scoresSum = 0;
        int minScore = scores[0];
        int maxScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            scoresSum += scores[i];
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        return (double)(scoresSum - minScore - maxScore) / (double)(scores.length - 2);
    }

    public static void main(String[] args) {
        CompetitionScoringSystem competitionScoringSystem = new CompetitionScoringSystem();

        competitionScoringSystem.setScores(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(competitionScoringSystem.calculateResult());

        competitionScoringSystem.setScores(new int[] { 1, 2, 1, 2, 5 });
        System.out.println(competitionScoringSystem.calculateResult());

        competitionScoringSystem.setScores(new int[] { 5, 4, 5, 3, 1 });
        System.out.println(competitionScoringSystem.calculateResult());
    }
}

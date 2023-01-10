public class Logic {
    private boolean[] logicalValues;

    public Logic(boolean[] logicalValues) {
        this.logicalValues = logicalValues;
    }

    public int opposite() {
        int oppositeCount = 0;

        for (int i = 1; i < logicalValues.length - 1; i++) {
            if (logicalValues[i - 1] == !logicalValues[i] && logicalValues[i + 1] == !logicalValues[i]) {
                oppositeCount++;
            }
        }

        return oppositeCount;
    }
}

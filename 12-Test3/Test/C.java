public class C {
    int[] salesQuantities;

    public C(int[] salesQuantities) {
        this.salesQuantities = salesQuantities;
    }

    public boolean m() {
        for (int i = 1; i < salesQuantities.length; i++) {
            if (salesQuantities[i] < salesQuantities[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

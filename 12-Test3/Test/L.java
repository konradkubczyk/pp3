public class L {
    B[] bs;

    public L(B[] bs) {
        this.bs = bs;
    }

    public int m() {
        int count = 0;

        for (int i = 1; i < bs.length - 1; i++) {
            if (bs[i].getB() == !bs[i - 1].getB() && bs[i].getB() == !bs[i + 1].getB()) {
                count++;
            }
        }

        return count;
    }
}

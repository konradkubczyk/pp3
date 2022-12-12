public class SuperCounter extends Counter {
    public SuperCounter(int initialValue) {
        super(initialValue);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            this.add1();
        }
    }
}

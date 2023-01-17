public class N {
    String text1;
    String text2;

    public N(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public N swap() {
        return new N(this.text2, this.text1);
    }

    public String toString() {
        return this.text1.concat(this.text2);
    }
}

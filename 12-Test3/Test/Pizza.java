public class Pizza extends Food implements Extra {
    private int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void setPrice() {
        this.setPrice(this.size - 10);
    }

    @Override
    public float discount() {
        if (this.getPrice() >= 30) {
            return this.getPrice() * 5 / 100;
        }
        return 0;
    }

    @Override
    public float delivery() {
        if (this.size >= 50) {
            return 8;
        }
        return 6;
    }

    @Override
    public float delivery(int tip) {
        return this.delivery() + tip;
    } 
}

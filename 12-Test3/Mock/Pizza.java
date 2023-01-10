public class Pizza extends Food implements Extra {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pizza(String name, int size) {
        super(name);
        this.setSize(size);
    }

    @Override
    public void setPrice() {
        this.price = this.getSize() - 10;
    }

    @Override
    public float delivery() {
        if (this.getSize() >= 50) { 
            return 8;
        }
        return 6;
    }

    @Override
    public float delivery(int tip) {
        return this.delivery() + tip;
    }

    @Override
    public float discount() {
        if (this.getSize() >= 30) {
            return this.getPrice() * 5 / 100;
        }
        return 0;
    }

}

public class Car extends Vehicle {
    private int speed;

    public Car(int seats, int speed) {
        super(seats);
        this.speed = speed;
    }

    public int[] spec() {
        return new int[] {this.getSeats(), this.speed};
    }
}

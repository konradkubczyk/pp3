public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        return new int[] {this.getSeats(), this.maxSpeed}; 
    }
}

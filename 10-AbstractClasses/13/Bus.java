public class Bus extends Vehicle {
    private int numberOfSeats;
    private int numberOfStandingPlaces;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfStandingPlaces() {
        return numberOfStandingPlaces;
    }

    public void setNumberOfStandingPlaces(int numberOfStandingPlaces) {
        this.numberOfStandingPlaces = numberOfStandingPlaces;
    }

    public Bus(String licensePlate, String brand, String model, int productionYear, int mileage,
            int numberOfSeats, int numberOfStandingPlaces) {
        super(licensePlate, brand, model, productionYear, mileage);
        this.setNumberOfSeats(numberOfSeats);
        this.setNumberOfStandingPlaces(numberOfStandingPlaces);
    }

    public String toString() {
        return "Bus: " +
                "\n- license plate: " + this.getLicensePlate() +
                "\n- brand: " + this.getBrand() +
                "\n- model: " + this.getModel() +
                "\n- production year: " + this.getProductionYear() +
                "\n- mileage: " + this.getMileage() +
                "\n- number of seats: " + this.getNumberOfSeats() +
                "\n- number of standing places: " + this.getNumberOfStandingPlaces();
    }
}

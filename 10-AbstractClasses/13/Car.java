public class Car extends Vehicle {
    private boolean isConvertible;

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public Car(String licensePlate, String brand, String model, int productionYear, int mileage,
            boolean isConvertible) {
        super(licensePlate, brand, model, productionYear, mileage);
        this.setConvertible(isConvertible);
    }

    public String toString() {
        return "Car: " +
                "\n- license plate: " + this.getLicensePlate() +
                "\n- brand: " + this.getBrand() +
                "\n- model: " + this.getModel() +
                "\n- production year: " + this.getProductionYear() +
                "\n- mileage: " + this.getMileage() +
                "\n- convertible: " + this.isConvertible();
    }
}

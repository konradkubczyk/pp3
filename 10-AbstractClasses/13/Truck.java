public class Truck extends Vehicle {
    private float maximumLoad;
    private boolean hasTrailer;
    private int numberOfAxles;

    public float getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(float maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public Truck(String licensePlate, String brand, String model, int productionYear, int mileage,
            float maximumLoad, boolean hasTrailer, int numberOfAxles) {
        super(licensePlate, brand, model, productionYear, mileage);
        this.setMaximumLoad(maximumLoad);
        this.setHasTrailer(hasTrailer);
        this.setNumberOfAxles(numberOfAxles);
    }

    public String toString() {
        return "Truck: " +
                "\n- license plate: " + this.getLicensePlate() +
                "\n- brand: " + this.getBrand() +
                "\n- model: " + this.getModel() +
                "\n- production year: " + this.getProductionYear() +
                "\n- mileage: " + this.getMileage() +
                "\n- maximum load: " + this.getMaximumLoad() +
                "\n- has trailer: " + this.isHasTrailer() +
                "\n- number of axles: " + this.getNumberOfAxles();
    }
}

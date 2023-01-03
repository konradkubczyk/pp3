public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;
    private int productionYear;
    private int mileage;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Vehicle(String licensePlate, String brand, String model, int productionYear, int mileage) {
        this.setLicensePlate(licensePlate);
        this.setBrand(brand);
        this.setModel(model);
        this.setProductionYear(productionYear);
        this.setMileage(mileage);
    }

    public abstract String toString();

    public void displayDetails() {
        System.out.println(this.toString());
    }
}

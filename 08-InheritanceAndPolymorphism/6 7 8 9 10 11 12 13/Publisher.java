public class Publisher {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Publisher(String name, String city) {
        this.setName(name);
        this.setCity(city);
    }

    public String toString() {
        return this.getName() + " from " + this.getCity();
    }
}
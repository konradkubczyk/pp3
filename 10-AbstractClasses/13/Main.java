public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car car = new Car("CA 1234", "Ford", "Focus", 2010, 100000, true);
        car.displayDetails();

        System.out.println();
        
        Bus bus = new Bus("WA 4321", "Solaris", "Urbino 12", 2018, 123456, 30, 20);
        bus.displayDetails();

        System.out.println();

        Truck truck = new Truck("Z 0010", "Volvo", "FH 16", 2019, 3000, 999999, true, 2);
        truck.displayDetails();
    }
}

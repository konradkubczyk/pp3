public class Date {
    public static void main(String[] args) {
        // Declare variables
        String day, month;
        int date, year;

        // Assign values
        day = "Friday";
        date = 13;
        month = "May";
        year = 2022;

        // Display the date in two formats
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}

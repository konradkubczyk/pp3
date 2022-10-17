public class Time {
    public static void main(String[] args) {
        // Declare integer variables
        int hour, minute, second;

        // Assign values
        hour = 21;
        minute = 32;
        second = 43;

        // Calculate and display number of seconds since midnight
        int secondsSinceMidninght = hour * 3600 + minute * 60 + second;
        System.out.println("Number of seconds since midnight: " + secondsSinceMidninght);

        // Calculate and display number of seconds remaining in the day
        int secondsRemaining = 24 * 3600 - (hour * 3600 + minute * 60 + second);
        System.out.println("Number of seconds remaining in the day: " + secondsRemaining);

        // Calculate and display percentage of the day that has passed
        double percentagePassed = ((hour * 3600 + minute * 60 + second) * 100.0) / (24 * 3600);
        System.out.println("Percentage of the day that has passed: " + percentagePassed + "%");

        // Assign new values
        hour = 22;
        minute = 33;
        second = 44;

        // Calculate and display elapsed time
        int newSecondsSinceMidninght = hour * 3600 + minute * 60 + second;
        int totalElapsedSeconds = newSecondsSinceMidninght - secondsSinceMidninght;
        int elapsedHours = totalElapsedSeconds / 3600;
        int elapsedMinutes = totalElapsedSeconds % 3600 / 60;
        int elapsedSeconds = totalElapsedSeconds % 3600 % 60;
        System.out.println("Elapsed time: " + elapsedHours + " hour(s), " + elapsedMinutes + " minute(s), " + elapsedSeconds + " second(s)");
    }
}

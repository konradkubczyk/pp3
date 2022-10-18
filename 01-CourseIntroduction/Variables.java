public class Variables {
    public static void main(String[] args) {
        // Declare a variable named "welcomingMessage" of type String
        String welcomingMessage;


        // Declare variables named "hours" and "minutes" of type int
        int hours, minutes;

        // Assing value "Hello!" to variable "welcomingMessage"
        welcomingMessage = "Hello!";

        // Assign values 15 and 17 to variables "hours" and "minutes" respectively
        hours = 12;
        minutes = 57;

        // Incorrect assignment of value of type int to variable of type String
        // String text = 123; // [ERROR] Type mismatch: cannot convert from int to String

        // Display the value of variable "welcomingMessage"
        System.out.print("The value of variable welcomingMessage is: ");
        System.out.println(welcomingMessage);

        // Convert the value of variable "hours" to minutes and add it to the value of variable "minutes", then display the result
        System.out.print("The number of minutes is: ");
        System.out.println(hours * 60 + minutes);

        // Example of a mistake caused by dividing an integer by an integer resulting in unexpected result stored in a variable of type double
        double oneThird = 1 / 3; // Integers are divided first, then the result is converted to double, causing rounding down to 0
        System.out.println("1 / 3 ≠ " + oneThird); // [OUTPUT] 1 / 3 = 0.0

        // Correct way of calculating the result of division of two integers
        oneThird = 1.0 / 3.0; // 3 is automatically converted to double 3.0
        System.out.println("1.0 / 3(.0) = " + oneThird); // [OUTPUT] 1 / 3 = 0.3333333333333333

        // Demonstration of a rounding error caused by binary floating-point representation
        System.out.println("0.1 * 10 = " + 0.1 * 10); // [OUTPUT] 0.1 * 10 = 1
        System.out.println("0.1 + 0.1 + ... + 0.1 = " + (0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1)); // [OUTPUT] 0.1 + 0.1 + ... + 0.1 = 0.9999999999999999
    }
}

import java.util.Random;

public class Smartphone {
    
    // Attributes
    String make;
    String model;
    int storageCapacity;
    int cpuCores;
    boolean isConnected;

    // Methods
    public void call(String number) {
        if (!isConnected) {
            System.out.println("The phone is offline.\n");
            return;
        }

        System.out.println("Calling " + number + "...");

        boolean pickedUp = new Random().nextBoolean();

        if (pickedUp) {
            System.out.println("Call picked up!\n");
        } else {
            System.out.println("No answer.\n");
        }
    }

    public void sendMessage(String message, String number) {
        if (!isConnected) {
            System.out.println("The phone is offline.\n");
            return;
        }

        System.out.println("Message sent!\n  Message: " + message + "\n  To: " + number + "\n");
    }

    public void switchConnectionState() {
        isConnected = !isConnected;
        if (isConnected) {
            System.out.println("The phone is now online.\n");
        } else {
            System.out.println("The phone is now offline.\n");
        }
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.call("123 456 789");
        smartphone.switchConnectionState();
        smartphone.call("123 456 789");
        smartphone.sendMessage("Hello!", "987 654 321");
        smartphone.switchConnectionState();
    }
    
}

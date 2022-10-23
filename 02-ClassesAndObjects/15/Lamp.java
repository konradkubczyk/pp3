public class Lamp {
    
    // Attributes
    boolean isOn;

    // Methods
    public void switchOn() {
        if (isOn) { 
            System.out.println("The lamp is already on");
            return;
        }

        isOn = true;
        System.out.println("The lamp is now on");
    }

    public void switchOff() {
        if (!isOn) { 
            System.out.println("The lamp is already off");
            return;
        }

        isOn = false;
        System.out.println("The lamp is now off");
    }

    public void displayState() {
        System.out.println("The lamp is " + (isOn ? "on" : "off"));
    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        lamp1.switchOn();
        lamp2.switchOff();

        lamp1.displayState();
        lamp2.displayState();
    }
}

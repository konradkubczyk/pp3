public class InternetDevice {

    String name;
    boolean connected;
    
    static int connectedDevices = 0;

    public InternetDevice(String name) {
        this.name = name;
    }

    public void connect() {
        if (!this.connected) {
            this.connected = true;
            InternetDevice.connectedDevices++;
        }
    }

    public void disconnect() {
        if (this.connected) {
            this.connected = false;
            InternetDevice.connectedDevices--;
        }
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void displayStatus() {
        System.out.println(
            "Device name: " + this.name +
            "\nStatus: " + (this.isConnected() ? "Connected" : "Disconnected")
        );
    }

    public static void displayConnections() {
        System.out.println("Number of connections: " + InternetDevice.connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice internetDevice1 = new InternetDevice("Device 1");
        InternetDevice internetDevice2 = new InternetDevice("Device 2");
        InternetDevice internetDevice3 = new InternetDevice("Device 3");
        InternetDevice internetDevice4 = new InternetDevice("Device 4");
        InternetDevice internetDevice5 = new InternetDevice("Device 5");

        InternetDevice.displayConnections();

        System.out.println();

        internetDevice1.connect();
        internetDevice2.connect();
        internetDevice3.connect();

        internetDevice1.displayStatus();
        System.out.println();
        internetDevice2.displayStatus();
        System.out.println();
        internetDevice3.displayStatus();
        System.out.println();
        internetDevice4.displayStatus();
        System.out.println();
        internetDevice5.displayStatus();

        System.out.println();

        InternetDevice.displayConnections();
    }

}
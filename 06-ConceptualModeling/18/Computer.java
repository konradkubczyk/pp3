import java.util.ArrayList;
import java.util.Arrays;

public class Computer {
    private static ArrayList<String> assignedLocalIpAddresses = new ArrayList<String>();
    private String hostname;
    private ArrayList<String> users;
    private boolean isOn;
    private boolean isConnected;
    private String localIpAddress;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    public String getLocalIpAddress() {
        return localIpAddress;
    }

    public void setLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
    }

    public Computer(String hostname, ArrayList<String> users) {
        this.setHostname(hostname);
        this.setUsers(users);
    }

    public String toString() {
        return this.getHostname() +
                "\n- users: " + (this.getUsers().size() > 0 ? String.join(", ", this.getUsers()) : "no users") +
                "\n- power state: " + (this.isOn() ? "on" : "off") +
                (this.isOn() ? "\n- connection: " + (this.isConnected() ? "online" : "offline") : "") +
                (this.isConnected() ? "\n- local IP address: " + this.getLocalIpAddress() : "");
    }

    public void powerOn() {
        if (this.isOn()) {
            throw new IllegalStateException("The computer is already on.");
        }
        this.setOn(true);
    }

    public void powerOff() {
        if (!this.isOn()) {
            throw new IllegalStateException("The computer is already off.");
        }
        this.setOn(false);
        this.setConnected(false);
    }

    public void connect() {
        if (!this.isOn()) {
            throw new IllegalStateException("The computer is off.");
        }
        if (this.isConnected()) {
            throw new IllegalStateException("The computer is already connected.");
        }
        this.setConnected(true);
        this.assignLocalIpAddress();
    }

    public void disconnect() {
        if (!this.isConnected()) {
            throw new IllegalStateException("The computer is already disconnected.");
        }
        this.setConnected(false);
    }

    private void assignLocalIpAddress() {
        while (true) {
            this.setLocalIpAddress("192.168.1." + (int) (Math.random() * 253 + 2));
            if (!Computer.assignedLocalIpAddresses.contains(localIpAddress)) {
                Computer.assignedLocalIpAddresses.add(localIpAddress);
            }
            break;
        }
    }

    public void addUser(String user) {
        if (!this.isOn()) {
            throw new IllegalStateException("The computer is off.");
        }
        this.getUsers().add(user);
    }

    public void removeUser(String user) {
        if (!this.isOn()) {
            throw new IllegalStateException("The computer is off.");
        }
        this.getUsers().remove(user);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("computer1", new ArrayList<String>());
        computer1.powerOn();
        computer1.powerOff();
        System.out.println(computer1 + "\n");
        computer1.powerOn();
        System.out.println(computer1 + "\n");
        computer1.connect();
        System.out.println(computer1 + "\n");

        Computer computer2 = new Computer("computer2", new ArrayList<String>(Arrays.asList("user1", "user2")));
        computer2.powerOn();
        computer2.connect();
        computer2.addUser("user3");
        computer2.removeUser("user1");
        System.out.println(computer2);
    }
}

import java.util.Arrays;

public class Computer {
    
    private String hostname;
    private String ip;
    private String[] users;
    private boolean isPoweredOn;

    public String getHostname() {
        return this.hostname;
    }

    public String getIP() {
        return this.ip;
    }

    public String[] getUsers() {
        return this.users;
    }

    public boolean getIsPoweredOn() {
        return this.isPoweredOn;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public void setIsPoweredOn(boolean isPoweredOn) {
        this.isPoweredOn = isPoweredOn;
    }

    public String toString() {
        return "Hostname: " + this.getHostname() +
        "\nIP: " + this.getIP() +
        "\nUsers: " + Arrays.toString(this.getUsers()) +
        "\nState: " + (this.getIsPoweredOn() ? "on" : "off");
    }
}

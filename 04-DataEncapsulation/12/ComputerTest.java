public class ComputerTest {
    
    public static void main(String[] args) {
        
        Computer computer = new Computer();

        computer.setHostname("vm");
        computer.setIP("192.168.1.123");
        computer.setUsers(new String[] {"root", "Bob", "Alice"});
        computer.setIsPoweredOn(true);

        System.out.println(computer);
    }
}

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number) {
        this.number = number;
        this.beds = 2;
    }

    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public void checkin(String guestName) {
        if (this.isOccupied()) {
            throw new IllegalStateException("Room is already occupied");
        }
        this.occupied = true;
        this.guestName = guestName;
    }

    public void checkout() {
        if (!this.isOccupied()) {
            throw new IllegalStateException("Room is already empty");
        }
        this.occupied = false;
        this.guestName = null;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void displayStatus() {
        System.out.println(
            "Number: " + this.number +
            "\nBeds: " + this.beds +
            "\nStatus: " + (this.occupied ? "occupied" +
            "\nGuest name: " + this.guestName : "vacant")
        );
    }

    public static void displayRoomsReport(Room[] rooms) {
        
        System.out.println("Rooms' state report:");
        
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i]);
        }
    }

    public static void displayRoomsWithNBeds(Room[] rooms, int numberOfBeds) {
        
        System.out.println("Rooms with " + numberOfBeds + " beds:");
        
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].beds == numberOfBeds) {
                System.out.println(rooms[i]);
            }
        }
    }

    public static void displayCountOfOccupiedAndVacantRooms(Room[] rooms) {
        
        int occupiedRoomsCount = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isOccupied()) {
                occupiedRoomsCount++;
            }
        }

        System.out.println("There are " + occupiedRoomsCount + " occupied rooms and " + (rooms.length - occupiedRoomsCount) + " vacant ones.");
    }

    public static void displayCountOfVacantBeds(Room[] rooms) {
        int vacantBedsCount = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied()) {
                vacantBedsCount += rooms[i].beds;
            }
        }

        System.out.println("There are " + vacantBedsCount + " vacant beds.");
    }

    public String toString() {
        return "Room " + this.number + " has " + this.beds + " bed(s) and is currenty " + (this.occupied ? "occupied" +
        " by " + this.guestName + "." : "vacant.");
    }

    public static void main(String[] args) {
        Room[] rooms = new Room[6];

        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4, 3);
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);

        rooms[0].checkin("Alice");
        rooms[2].checkin("Bob");

        // rooms[1].checkout(); // throws IllegalStateException (room already empty)
        // rooms[0].checkin("Jeff"); // throws IllegalStateException (room already occupied)

        System.out.println();
        System.out.println(rooms[0] + "\n");
        Room.displayRoomsReport(rooms);
        System.out.println();
        Room.displayRoomsWithNBeds(rooms, 2);
        System.out.println();
        Room.displayCountOfOccupiedAndVacantRooms(rooms);
        System.out.println();
        Room.displayCountOfVacantBeds(rooms);
        System.out.println();
    }
}

public class CinemaTicket {
    
    static String cinemaName = "Morning Star Cinema";
    
    String filmName;
    int row;
    int seat;
    double price;
    
    public CinemaTicket(String newFilmName, int newRow, int newSeat) {
        filmName = newFilmName;
        row = newRow;
        seat = newSeat;
        
        if (row < 3) {
            price = 10.0;
        } else {
            price = 25.0;
        }
    }
    
    public void displayTicket() {
        System.out.println(
            "Cinema name: " + CinemaTicket.cinemaName +
            "\nFilm name: " + filmName +
            "\nRow: " + row +
            "\nSeat: " + seat +
            "\nPrice: " + price
        );
    }
    
    public static void main(String[] args) {
        CinemaTicket cinemaTicket1 = new CinemaTicket(
            "Gladiator",
            2,
            3
        );
        cinemaTicket1.displayTicket();

        System.out.println();

        CinemaTicket cinemaTicket2 = new CinemaTicket(
            "Gladiator",
            7,
            15
        );
        cinemaTicket2.displayTicket();
    }
}
public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public String toString() {
        return super.toString() + " (" + this.getMinutes() + ":" + this.getSeconds() + ")";
    }

    // The following method is not necessary, but it is included to demonstrate the need for the attributes of the parent class to be protected, not private.    
    public void display() {
        System.out.println(this.title + " by " + this.author + " (" + this.minutes + ":" + this.seconds + ")");
    }
}

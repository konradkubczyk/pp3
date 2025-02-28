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

    public Audiobook(String title, Writer author, Publisher publisher, int yearOfPublication, int minutes, int seconds) {
        super(title, author, publisher, yearOfPublication);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public String toString() {
        return super.toString() + " (" + this.getMinutes() + ":" + this.getSeconds() + ")";
    }

    // The following method is not necessary, but it is included to demonstrate the need for the attributes of the parent class to be protected, not private.    
    public void display() {
        System.out.println(this.title + " by " + this.author + " published by " + this.publisher + " in " + this.yearOfPublication + " (" + this.minutes + ":" + this.seconds + ")");
    }
}

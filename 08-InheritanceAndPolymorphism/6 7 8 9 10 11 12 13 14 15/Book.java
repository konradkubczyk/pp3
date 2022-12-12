public class Book {
    protected String title;
    protected Writer author;
    protected Publisher publisher;
    protected int yearOfPublication;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String title, Writer author, Publisher publisher, int yearOfPublication) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setYearOfPublication(yearOfPublication);
    }

    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published by " + this.getPublisher()  + " in " + this.getYearOfPublication();
    }

    public void display() {
        System.out.println(this);
    }
}
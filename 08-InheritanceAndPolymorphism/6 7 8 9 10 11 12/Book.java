public class Book {
    protected String title;
    protected String author;
    protected Publisher publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Book(String title, String author, Publisher publisher) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
    }

    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published by " + this.publisher;
    }

    public void display() {
        System.out.println(this);
    }
}
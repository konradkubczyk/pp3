public class Book {
    protected String title;
    protected String author;

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

    public Book(String title, String author) {
        this.setTitle(title);
        this.setAuthor(author);
    }

    public String toString() {
        return this.getTitle() + " by " + this.getAuthor();
    }

    public void display() {
        System.out.println(this);
    }
}
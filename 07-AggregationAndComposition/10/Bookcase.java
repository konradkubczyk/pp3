import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Bookcase() {
        this.setBooks(new ArrayList<Book>());
    }
    
    public void addBook(Book book) {
        this.getBooks().add(book);
    }

    public void removeBook(Book book) {
        this.getBooks().remove(book);
    }

    public String toString() {
        String result = "Bookcase: ";
        if (this.getBooks().size() == 0) {
            return result + "the bookcase is empty";
        }
        for (Book book : this.getBooks()) {
            result += book.toString() + ", ";
        }
        return result;
    }
}

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Library() {
        this.setBooks(new ArrayList<Book>());
    }

    public Library(ArrayList<Book> books) {
        this.setBooks(books);
    }

    public String toString() {
        String result = "Library:";
        if (this.getBooks().size() == 0) {
            result += " No books in library.";
        } else {
            for (Book book : this.getBooks()) {
                result += "\n- " + book.toString();
            }
        }
        return result;
    }

    public void display() {
        System.out.println(this);
    }

    public void addBook(Book book) {
        this.getBooks().add(book);
    }

    public void removeBook(int index) {
        this.getBooks().remove(index);
    }

    public void removeBook(String title) {
        for (int i = 0; i < this.getBooks().size(); i++) {
            if (this.getBooks().get(i).getTitle().equals(title)) {
                this.getBooks().remove(i);
                break;
            }
        }
    }
}

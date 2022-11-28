import java.util.Arrays;

public class Book {
    private static String[] genres = { "crime", "drama", "fantasy", "science fiction" };
    private String title;
    private String author;
    private String genre;
    private int pages;
    private int publicationYear;
    private String publisher;
    private String isbn;
    private String description;

    public static String[] getGenres() {
        return genres;
    }

    public static void setGenres(String[] genres) {
        Book.genres = genres;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (Arrays.asList(genres).contains(genre)) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Invalid genre");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Book details:" +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nPages: " + pages +
                "\nPublication year: " + publicationYear +
                "\nPublisher: " + publisher +
                "\nISBN: " + isbn +
                "\nDescription: " + description;
    }

    public Book(String title, String author, String genre, int pages, int publicationYear, String publisher, String isbn, String description) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setPages(pages);
        this.setPublicationYear(publicationYear);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
        this.setDescription(description);
    }
}

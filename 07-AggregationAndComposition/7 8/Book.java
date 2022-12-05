import java.util.ArrayList;

public class Book {
    private String title;
    private int publicationYear;
    private String publisher;
    private String genre;
    private String isbn;
    private int pages;
    private int currentPage = 0;
    private Author author;
    private ArrayList<Chapter> chapters;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Book(String title, int publicationYear, String genre, String isbn, int pages, Author author) {
        this.setTitle(title);
        this.setPublicationYear(publicationYear);
        this.setGenre(genre);
        this.setIsbn(isbn);
        this.setAuthor(author);
        this.setPages(pages);
        this.setChapters(new ArrayList<Chapter>());
    }

    public String toString() {
        String string = "\n- " + title +
                        "\n  - publicationYear: " + publicationYear +
                        "\n  - publisher: " + publisher +
                        "\n  - genre: " + genre +
                        "\n  - isbn: " + isbn +
                        "\n  - pages: " + pages +
                        "\n  - currentPage: " + currentPage +
                        "\n  - author:" + 
                        "\n    - name: " + author.getName() +
                        "\n    - surname: " + author.getSurname() +
                        "\n    - state: " + (author.isAlive() ? "alive" : "dead") +
                        "\n  - chapters: ";
        for (Chapter chapter : chapters) {
            string += "\n    - " + chapter.toString();
        }
        return string;
    }

    public void open(int page) {
        this.setCurrentPage(page);
    }

    public void close() {
        if (currentPage == 0) {
            throw new IllegalStateException("The book is already closed!");
        }
    }

    public double getProgress() {
        return (double) currentPage / (double) pages;
    }

    public void nextPage() {
        if (currentPage == pages) {
            throw new IllegalStateException("You have reached the end of the book!");
        }
        currentPage++;
    }

    public void previousPage() {
        if (currentPage == 0) {
            throw new IllegalStateException("The book is closed!");
        }
        if (currentPage == 1) {
            throw new IllegalStateException("You have reached the beginning of the book!");
        }
        currentPage--;
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void removeChapter(Chapter chapter) {
        chapters.remove(chapter);
    }
}

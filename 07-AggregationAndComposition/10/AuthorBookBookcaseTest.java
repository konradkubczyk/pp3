public class AuthorBookBookcaseTest {
    public static void main(String[] args) {
        Author author = new Author("John", "Doe", true);
        Book book1 = author.writeABook("Book 1", 2019, "Fiction", "1234567890123", 100);
        Book book2 = author.writeABook("Book 2", 2019, "Fiction", "1234567890124", 100);

        Bookcase bookcase = new Bookcase();
        System.out.println("\n" + bookcase + "\n");
        bookcase.addBook(book1);
        System.out.println(bookcase + "\n");
        bookcase.addBook(book2);
        System.out.println(bookcase + "\n");
        bookcase.removeBook(book1);
        System.out.println(bookcase + "\n");
    }
}

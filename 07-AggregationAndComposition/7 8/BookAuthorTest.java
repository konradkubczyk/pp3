public class BookAuthorTest {
    public static void main(String[] args) {
        Author author = new Author("John", "Doe", true);
        Book book = author.writeABook("Some book", 1899, "science fiction", "9MT5SYM973S3S", 5);
        System.out.println(book);
    }
}

public class BookEbookAudiobookLibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book book3 = new Book("The Silmarillion", "J.R.R. Tolkien");

        Ebook ebook1 = new Ebook("The Hobbit", "J.R.R. Tolkien", "the-hobbit.epub");
        Ebook ebook2 = new Ebook("The Lord of the Rings", "J.R.R. Tolkien", "the-lord-of-the-rings.epub");
        Ebook ebook3 = new Ebook("The Silmarillion", "J.R.R. Tolkien", "the-silmarillion.epub");

        Audiobook audiobook1 = new Audiobook("The Hobbit", "J.R.R. Tolkien", 10, 30);
        Audiobook audiobook2 = new Audiobook("The Lord of the Rings", "J.R.R. Tolkien", 20, 30);
        Audiobook audiobook3 = new Audiobook("The Silmarillion", "J.R.R. Tolkien", 30, 30);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nBooks:");
        book1.display();
        book2.display();
        book3.display();

        System.out.println("\nEbooks:");
        ebook1.display();
        ebook2.display();
        ebook3.display();

        System.out.println("\nAudiobooks:");
        audiobook1.display();
        audiobook2.display();
        audiobook3.display();

        System.out.println("\n" + library + "\n");
    }
}

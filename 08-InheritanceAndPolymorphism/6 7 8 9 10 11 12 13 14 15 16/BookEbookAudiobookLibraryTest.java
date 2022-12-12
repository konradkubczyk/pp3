public class BookEbookAudiobookLibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", new Writer("J.R.R.", "Tolkien", "fantasy"), new Publisher("Houghton Mifflin Harcourt", "Boston"), 1937);
        Book book2 = new Book("Romeo and Juliet", new Writer("William", "Shakespeare", "tragedy"), new Publisher("Penguin Classics", "New York"), 1597);
        Book book3 = new Book("The Wizard of Oz", new Writer("L.", "Frank Baum", "fantasy"), new Publisher("Penguin Classics", "New York"), 1900);

        Ebook ebook1 = new Ebook("The Hobbit", new Writer("J.R.R.", "Tolkien", "fantasy"), new Publisher("Houghton Mifflin Harcourt", "Boston"), 1937, "the-hobbit.epub");
        Ebook ebook2 = new Ebook("Romeo and Juliet", new Writer("William", "Shakespeare", "tragedy"), new Publisher("Penguin Classics", "New York"), 1597, "romeo-and-juliet.epub");
        Ebook ebook3 = new Ebook("The Wizard of Oz", new Writer("L.", "Frank Baum", "fantasy"), new Publisher("Penguin Classics", "New York"), 1900, "the-wizard-of-oz.epub");

        Audiobook audiobook1 = new Audiobook("The Hobbit", new Writer("J.R.R.", "Tolkien", "fantasy"), new Publisher("Houghton Mifflin Harcourt", "Boston"), 1937, 10, 30);
        Audiobook audiobook2 = new Audiobook("Romeo and Juliet", new Writer("William", "Shakespeare", "tragedy"), new Publisher("Penguin Classics", "New York"), 1597, 5, 45);
        Audiobook audiobook3 = new Audiobook("The Wizard of Oz", new Writer("L.", "Frank Baum", "fantasy"), new Publisher("Penguin Classics", "New York"), 1900, 7, 15);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(ebook2);
        library.addBook(audiobook3);

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

public class BookEbookAudiobookLibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", new Publisher("Houghton Mifflin Harcourt", "Boston"));
        Book book2 = new Book("Romeo and Juliet", "William Shakespeare", new Publisher("Penguin Classics", "New York"));
        Book book3 = new Book("The Wizard of Oz", "L. Frank Baum", new Publisher("Penguin Classics", "New York"));

        Ebook ebook1 = new Ebook("The Hobbit", "J.R.R. Tolkien", new Publisher("Houghton Mifflin Harcourt", "Boston"), "the-hobbit.epub");
        Ebook ebook2 = new Ebook("Romeo and Juliet", "William Shakespeare", new Publisher("Penguin Classics", "New York"), "romeo-and-juliet.epub");
        Ebook ebook3 = new Ebook("The Wizard of Oz", "L. Frank Baum", new Publisher("Penguin Classics", "New York"), "the-wizard-of-oz.epub");

        Audiobook audiobook1 = new Audiobook("The Hobbit", "J.R.R. Tolkien", new Publisher("Houghton Mifflin Harcourt", "Boston"), 10, 30);
        Audiobook audiobook2 = new Audiobook("Romeo and Juliet", "William Shakespeare", new Publisher("Penguin Classics", "New York"), 5, 45);
        Audiobook audiobook3 = new Audiobook("The Wizard of Oz", "L. Frank Baum", new Publisher("Penguin Classics", "New York"), 7, 15);

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

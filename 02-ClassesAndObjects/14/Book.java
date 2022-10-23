public class Book {

    // Attributes
    String title;
    String author;
    int numberOfPages;
    int currentPage = 1;
    boolean isOpen = false;

    // Methods
    public void open(int newCurrentPage) {
        if (isOpen) {
            System.out.println("The book is already open\n");
        } else {
            if (newCurrentPage > 0 && newCurrentPage <= numberOfPages) {
                isOpen = true;
                currentPage = newCurrentPage;
                System.out.println("The book is now open on page " + newCurrentPage + "\n");
            } else {
                System.out.println("There is no page " + newCurrentPage + " in the book, available pages range from 1 to " + numberOfPages + ", the book remains closed\n");
            }
        }
    }

    public void close() {
        if (!isOpen) {
            System.out.println("The book is already closed\n");
        } else {
            isOpen = false;
            System.out.println("The book is now closed\n");
        }
    }

    public void nextPage() {
        if (!isOpen) {
            System.out.println("The book is closed, open it before changing pages\n");
        } else if (currentPage < numberOfPages) {
            currentPage++;
            System.out.println("Page flipped from " + (currentPage - 1) + " to " + currentPage + "\n");
        } else {
            System.out.println("You are at the end of the book\n");
        }
    }

    public void previousPage() {
        if (!isOpen) {
            System.out.println("The book is closed, open it before changing pages\n");
        } else if (currentPage > 1) {
            currentPage--;
            System.out.println("Page flipped from " + (currentPage + 1) + " to " + currentPage + "\n");
        } else {
            System.out.println("You are at the beginning of the book\n");
        }
    }

    public void showDetails() {
        System.out.println(
            "[ Book Details ]" +
            "\nTitle: " + title +
            "\nAuthor: " + author +
            "\nNumber of pages: " + numberOfPages +
            "\nCurrent page: " + currentPage +
            "\nState: " + (isOpen ? "Open" : "Closed") +
            "\n"
        );
    }

    public static void main(String[] args) {
        
        // book1 object
        Book book1 = new Book();

        book1.title = "Book number one";
        book1.author = "Someone";
        book1.numberOfPages = 5;

        book1.nextPage();
        book1.open(1);
        book1.previousPage();
        book1.nextPage();
        book1.close();
        book1.open(5);
        book1.previousPage();
        
        // book2 object
        Book book2 = new Book();

        book2.title = "Book number one";
        book2.author = "Someone";
        book2.numberOfPages = 50;

        book2.open(0);
        book2.open(200);
        book2.showDetails();
    }
}

public class Ebook extends Book {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.setFileName(fileName);
    }

    public String toString() {
        return super.toString() + " (" + this.getFileName() + ")";
    }

    // The following method is not necessary, but it is included to demonstrate the need for the attributes of the parent class to be protected, not private.    
    public void display() {
        System.out.println(this.title + " by " + this.author + " (" + this.fileName + ")");
    }
}

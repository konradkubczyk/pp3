public class Chapter {
    private String title;
    private int pages;
    private int startingPage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getStartingPage() {
        return startingPage;
    }

    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }

    public Chapter(String title, int pages, int startingPage) {
        this.setTitle(title);
        this.setPages(pages);
        this.setStartingPage(startingPage);
    }

    public String toString() {
        return this.getTitle() + " (" + this.getStartingPage() + "-" + (this.getStartingPage() + this.getPages() - 1) + ")";
    }

}

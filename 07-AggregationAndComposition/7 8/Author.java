public class Author {
    private String name;
    private String surname;
    private boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Author(String name, String surname, boolean isAlive) {
        this.name = name;
        this.surname = surname;
        this.isAlive = isAlive;
    }

    public String toString() {
        return "Author" +
                "\n- name: " + name +
                "\n- surname: " + surname +
                "\n- isAlive: " + isAlive;
    }

    public Book writeABook(String title, int publicationYear, String genre, String isbn, int pages) {
        return new Book(title, publicationYear, genre, isbn, pages, this);
    }
}

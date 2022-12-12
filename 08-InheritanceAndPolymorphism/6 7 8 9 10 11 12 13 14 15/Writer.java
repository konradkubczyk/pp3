public class Writer {
    private String firstName;
    private String lastName;
    private String literaryGenre;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLiteraryGenre() {
        return literaryGenre;
    }

    public void setLiteraryGenre(String literaryGenre) {
        this.literaryGenre = literaryGenre;
    }

    public Writer(String firstName, String lastName, String literaryGenre) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setLiteraryGenre(literaryGenre);
    }

    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " (" + this.getLiteraryGenre() + ")";
    }
}
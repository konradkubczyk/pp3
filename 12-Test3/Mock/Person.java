public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return String.valueOf(name.charAt(0)).toUpperCase() + String.valueOf(surname.charAt(0)).toUpperCase();
    }
}

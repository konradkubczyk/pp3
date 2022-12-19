import java.util.ArrayList;

public class Family {
    private ArrayList<Person> family = new ArrayList<Person>();

    public void add(Person p) {
        family.add(p);
    }

    public int adults() {
        int adultsCount = 0;

        for (Person person : family) {
            if (person.getAge() >= 18) {
                adultsCount++;
            }
        }

        return adultsCount;
    }
}

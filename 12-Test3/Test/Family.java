import java.util.ArrayList;

public class Family {
    ArrayList<Person> family = new ArrayList<Person>();

    public void add(Person p) {
        this.family.add(p);
    }

    public int adults() {
        int count = 0;
        
        for (Person person : family) {
            if (person.getAge() >= 18) {
                count++;
            }
        }

        return count;
    }
}

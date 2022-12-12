public class Family {
    private Person[] family;

    public Family(Person[] people) {
        this.family = people;
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

public class Person {
    private String name;
    private int age;

    Person(String name, int adult) {
        this.setName(name);
        this.setAge(adult);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public String toString() {
        return this.name + "," + this.age;
    }

    public static void main(String[] args) {
        Person p = new Person("Anna",21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p);
    }
}

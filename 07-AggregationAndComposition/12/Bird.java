import java.util.ArrayList;
import java.util.List;

public class Bird {
    private String name;
    private String species;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bird(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String toString() {
        return this.getName() + " (" + this.getSpecies() + "; " + this.getAge() + ")";
    }

    public void createNest(Tree tree) {
        Nest nest = new Nest(new ArrayList<>(List.of(this)));
        tree.getNests().add(nest);
    }

    public void removeFromNest(Nest nest) {
        nest.getBirds().remove(this);
    }
}

import java.util.ArrayList;

public class Nest {
    private ArrayList<Bird> birds;

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public Nest(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public String toString() {
        String result = "\n  - Nest: ";
        if (this.getBirds().size() == 0) {
            return result + " the nest is empty";
        }
        for (Bird bird : this.getBirds()) {
            result += "\n    - " + bird.toString();
        }
        return result;
    }

    public void addBird(Bird bird) {
        this.getBirds().add(bird);
    }

    public void removeBird(Bird bird) {
        this.getBirds().remove(bird);
    }
}

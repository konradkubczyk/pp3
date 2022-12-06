import java.util.ArrayList;

public class Tree {
    private ArrayList<Nest> nests;

    public ArrayList<Nest> getNests() {
        return nests;
    }

    public void setNests(ArrayList<Nest> nests) {
        this.nests = nests;
    }

    public Tree() {
        this.setNests(new ArrayList<Nest>());
    }

    public String toString() {
        String result = "";
        if (this.getNests().size() == 0) {
            return result + " the tree is empty";
        }
        for (Nest nest : this.getNests()) {
            result += nest.toString() + ", ";
        }
        return result;
    }

    public void createNest(Nest nest) {
        this.getNests().add(nest);
    }

    public void removeNest(Nest nest) {
        this.getNests().remove(nest);
        nest.getBirds().clear();
    }
}

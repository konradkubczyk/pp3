import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees;

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    public void setTrees(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public Forest(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public String toString() {
        String result = "Forest: ";
        if (this.getTrees().size() == 0) {
            return result + "the forest is empty";
        }
        for (Tree tree : this.getTrees()) {
            result += "\n- Tree " + (this.getTrees().indexOf(tree) + 1) + ":" + tree.toString();
        }
        return result;
    }

    public void createTree(Tree tree) {
        this.getTrees().add(tree);
    }

    public void removeTree(Tree tree) {
        this.getTrees().remove(tree);
        tree.getNests().clear();
    }
}

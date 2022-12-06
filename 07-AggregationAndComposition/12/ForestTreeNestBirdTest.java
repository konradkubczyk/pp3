import java.util.ArrayList;
import java.util.List;

public class ForestTreeNestBirdTest {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();

        Forest forest = new Forest(new ArrayList<>(List.of(tree1, tree2)));

        Bird bird1 = new Bird("Polly", "Parrot", 3);

        bird1.createNest(tree1);
        bird1.createNest(tree2);

        System.out.println("\n" + forest + "\n");

        bird1.removeFromNest(tree1.getNests().get(0));

        System.out.println(forest + "\n");

        tree1.removeNest(tree1.getNests().get(0));

        System.out.println(forest + "\n");

        forest.removeTree(tree2);

        System.out.println(forest);
    }
}

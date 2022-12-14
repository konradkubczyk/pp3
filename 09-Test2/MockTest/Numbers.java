import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Numbers(int a, int b, int c, int d, int e) {
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
    }

    public boolean different() {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j) && i != j) {
                    return false;
                }
            }
        }
        return true;
    }
}

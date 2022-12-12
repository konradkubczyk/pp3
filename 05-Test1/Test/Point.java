public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public boolean isY() {
        if (this.x == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "P(" + this.x + "," + this.y + ")";
    }
}

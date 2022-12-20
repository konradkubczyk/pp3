public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(
            "\nRectangle: " +
            "\n- width: " + rectangle.getWidth() +
            "\n- height: " + rectangle.getHeight() +
            "\n- area: " + rectangle.area() +
            "\n- perimeter: " + rectangle.perimeter()
        );

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(
            "\nTriangle: " +
            "\n- a: " + triangle.getA() +
            "\n- b: " + triangle.getB() +
            "\n- c: " + triangle.getC() +
            "\n- area: " + triangle.area() +
            "\n- perimeter: " + triangle.perimeter()
        );

        Circle circle = new Circle(5);
        System.out.println(
            "\nCircle: " +
            "\n- radius: " + circle.getRadius() +
            "\n- area: " + circle.area() +
            "\n- perimeter: " + circle.perimeter()
        );
    }
}

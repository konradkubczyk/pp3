public class Rectangle {
    
    // Attributes
    double width;
    double height;

    // Methods
    public void displayDimensions() {
        System.out.println("Dimensions: " + width + " x " + height);
    }

    public void displayPerimeter() {
        double perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
    }

    public void displaySurface() {
        double surface = width * height;
        System.out.println("Surface: " + surface);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.height = 4;
        rectangle1.displayDimensions();
        rectangle1.displayPerimeter();
        rectangle1.displaySurface();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 2;
        rectangle2.height = 7;
        rectangle2.displayDimensions();
        rectangle2.displayPerimeter();
        rectangle2.displaySurface();
    }
}

public class SurfaceArea {
    
    public static double ofCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static double ofRectangle(double width, double height) {
        return width * height;      
    }
    
    public static double ofTriangle(double base, double height) {
        return base * height / 2.0;
    }
    
    public static void main(String[] args) {
        System.out.println("Surface area of a triangle of width 4 and height 5: " + SurfaceArea.ofRectangle(4, 5));
        System.out.println("Surface area of a circle of radius 3: " + SurfaceArea.ofCircle(3));;
        System.out.println("Surface area of a triangle of base 3 and height 4: " + SurfaceArea.ofTriangle(3, 4));
    }
    
}
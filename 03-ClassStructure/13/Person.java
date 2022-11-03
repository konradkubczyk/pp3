public class Person {

    String name;
    double weight;
    double height;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double newWeight, double newHeight) {
        weight = newWeight;
        height = newHeight;
    }

    public double calculateBMI() {
        return weight / Math.pow(height / 100, 2);
    }

    public void displayRecord() {
        double bmi = calculateBMI();
        
        System.out.println(
            "Name: " + name +
            "\nWeight: " + weight +
            "\nHeight: " + height +
            "\nBMI: " + bmi
        );

        if (bmi > 24.9) {
            System.out.println("BMI too high");
        } else if (bmi < 18.5) {
            System.out.println("BMI too low");
        }
    }

    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 100, 130);
        person1.displayRecord();

        System.out.println();

        Person person2 = new Person("Bob");
        person2.displayRecord();

    }

}

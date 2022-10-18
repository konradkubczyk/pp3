public class Student  {
    
    // Attributes
    String name;
    int age;
    String studentIdCard;
    boolean isIdCardValid;
    int semesterNumber;
    double averageGrade;
    
    // Methods metod
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void displayName() {
        System.out.println("My name is " + name);
    }
    public void displayAge() {
        System.out.println("I am " + age + " years old");
    }
    public void displayInfo() {
        System.out.println("Student name: " + name + "\nSemester number: " + semesterNumber + "\nAverage grade: " + averageGrade);
    }
    public void changeIdCardStatus() {
        isIdCardValid = !isIdCardValid;
    }
    public void displayIdCardInfo() {
        System.out.println("Student name: " + name + "\nID card number: " + studentIdCard + "\nID card valid: " + isIdCardValid);
    }
    public static void main(String[] args) {
        
        Student student1 = new Student();
        
        student1.name = "Konrad";
        student1.age = 2;
        student1.studentIdCard = "123456";
        student1.isIdCardValid = true;
        student1.semesterNumber = 10;
        student1.averageGrade = 5.0;
        
        student1.sayHello();
        student1.displayName();
        student1.displayAge();
        student1.displayInfo();
        student1.displayIdCardInfo();
        student1.changeIdCardStatus();
        student1.displayIdCardInfo();
        
    }
    
}
import java.util.Arrays;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public double getLowestGrade() {

        double minGrade = this.grades[0];

        for (int i = 1; i < this.grades.length; i++) {
            
            if (this.grades[i] < minGrade) {
                minGrade = this.grades[i];
            }
        }

        return minGrade;
    }

    public double getHighestGrade() {

        double maxGrade = this.grades[0];

        for (int i = 1; i < this.grades.length; i++) {
            
            if (this.grades[i] > maxGrade) {
                maxGrade = this.grades[i];
            }
        }

        return maxGrade;
    }

    public int getNumberOfGrades() {
        return this.grades.length;
    }

    public double getGradePointAverage() {

        double sumOfGrades = 0;

        for (int i = 0; i < this.grades.length; i++) {
            sumOfGrades += this.grades[i];
        }

        return sumOfGrades / this.getNumberOfGrades();
    }

    public void displayStudentRecord() {
        System.out.println(
            "Student name: " + this.studentName +
            "\nGrades: " + Arrays.toString(this.grades) +
            "\nNumber of grades: " + this.getNumberOfGrades() +
            "\nLowest grade: " + this.getLowestGrade() +
            "\nHighest grade: " + this.getHighestGrade() +
            "\nGrade point average: " + this.getGradePointAverage()
        );
    }

    public static void main(String[] args) {
    
        StudentGrades student1 = new StudentGrades("Amanda", new double[] { 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5 });
        StudentGrades student2 = new StudentGrades("James", new double[] { 2.0, 3.0, 2.0, 4.5, 4.5 });

        student1.displayStudentRecord();
        System.out.println();
        student2.displayStudentRecord();
    }
}
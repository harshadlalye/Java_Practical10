/* Q11. Write a Java program to  
Write an application to define an interface ‘CalculateResult’ with methods    
CalculateTotal(),  CalculatePercentage()  and  CalculateGrade().  Write  student  class 
with  implementation  of  ‘CalculateResult’.  Create  student  object  and  display  total 
marks, percentage and grade of student.  */
// Define the CalculateResult interface
interface CalculateResult {
    double CalculateTotal();

    double CalculatePercentage();

    String CalculateGrade();
}

// Implement the CalculateResult interface in the Student class
class Student implements CalculateResult {
    String name;
    double marks1, marks2, marks3;
    double total, percentage;
    String grade;

    public Student(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double CalculateTotal() {
        total = marks1 + marks2 + marks3;
        return total;
    }

    public double CalculatePercentage() {
        percentage = (total / 300) * 100;
        return percentage;
    }

    public String CalculateGrade() {
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}

// Main class to create student object and display result
public class Q11 {
    public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student("John", 85, 90, 95);

        // Calculate and display the total marks
        double total = s1.CalculateTotal();
        System.out.println("Total marks: " + total);

        // Calculate and display the percentage
        double percentage = s1.CalculatePercentage();
        System.out.println("Percentage: " + percentage + "%");

        // Calculate and display the grade
        String grade = s1.CalculateGrade();
        System.out.println("Grade: " + grade);
    }
}

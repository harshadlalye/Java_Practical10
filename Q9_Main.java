
/* Q.9. Write a Java program.
Write a Java program to create a package named student. Define class studentInfo with method to display information about student such as rollno, name, class and percentage. Create another class studentPer with method to find percentage of the student. Accept student details like rollno, name, class and marks of three subject from user. */
// Main.java
import student.*;

public class Q9_Main {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo(101, "John Doe", "Class 10", 85.5f);
        StudentInfo student2 = new StudentInfo(102, "Jane Doe", "Class 12", 90.0f);
        StudentInfo student3 = new StudentInfo(103, "Bob Smith", "Class 11", 78.5f);
        StudentInfo student4 = new StudentInfo(104, "Alice Johnson", "Class 9", 92.0f);
        StudentInfo student5 = new StudentInfo(105, "Mike Brown", "Class 12", 88.5f);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();

        StudentPer student6 = new StudentPer(106, "Tom Jones", "Class 10", 80.0f, 75.5f, 82.0f);
        StudentPer student7 = new StudentPer(107, "Sarah Lee", "Class 11", 90.5f, 88.0f, 81.0f);
        student6.displayPercentage();
        student7.acceptDetails();
        student7.displayPercentage();
    }
}

// StudentPer.java
package student;

import java.util.Scanner;

public class StudentPer {
    private int rollNo;
    private String name;
    private String className;
    private float marks1;
    private float marks2;
    private float marks3;

    public StudentPer(int rollNo, String name, String className, float marks1, float marks2, float marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public float calculatePercentage() {
        return (marks1 + marks2 + marks3) / 3;
    }

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll no.: ");
        rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter class: ");
        className = scanner.nextLine();
        System.out.print("Enter marks for subject 1: ");
        marks1 = scanner.nextFloat();
        System.out.print("Enter marks for subject 2: ");
        marks2 = scanner.nextFloat();
        System.out.print("Enter marks for subject 3: ");
        marks3 = scanner.nextFloat();
    }

    public void displayPercentage() {
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

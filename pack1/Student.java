package pack1;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int age;
    private String major;

    public void readInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        this.id = scanner.nextInt();

        System.out.print("Enter student age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student major: ");
        this.major = scanner.nextLine();
    }

    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + "\nAge: " + this.age + "\nMajor: " + this.major;
    }
}
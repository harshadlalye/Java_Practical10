package pack1;

import java.util.Scanner;

public class Course {
    private String name;
    private int id;
    private int credits;

    public void readInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter course ID: ");
        this.id = scanner.nextInt();

        System.out.print("Enter course credits: ");
        this.credits = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + "\nCredits: " + this.credits;
    }
}
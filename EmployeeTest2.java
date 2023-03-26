
/* Q.7. Write a Java program to
Create an abstract class Employee. 
Derive two classes manager and worker from it. 
Use proper method to accept and display 4 the details for the same. 
The fields of manager are mid, mname and phno. 
Similarly, fields for worker are name and working
hours. */
import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    protected String name;

    // Abstract method to accept details
    public abstract void acceptDetails();

    // Abstract method to display details
    public abstract void displayDetails();
}

// Derived class Manager
class Manager extends Employee {
    protected int mid;
    protected String mname;
    protected String phno;

    // Method to accept details for Manager
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager ID: ");
        mid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Manager Name: ");
        mname = sc.nextLine();

        System.out.print("Enter Manager Phone Number: ");
        phno = sc.nextLine();
    }

    // Method to display details for Manager
    public void displayDetails() {
        System.out.println("Manager ID: " + mid);
        System.out.println("Manager Name: " + mname);
        System.out.println("Manager Phone Number: " + phno);
    }
}

// Derived class Worker
class Worker extends Employee {
    protected int workingHours;

    // Method to accept details for Worker
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Worker Name: ");
        name = sc.nextLine();

        System.out.print("Enter Working Hours: ");
        workingHours = sc.nextInt();
    }

    // Method to display details for Worker
    public void displayDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Working Hours: " + workingHours);
    }
}

// Main class to test the program
public class EmployeeTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of Employee (Manager/Worker): ");
        String type = sc.nextLine();

        // Creating object of Manager class
        if (type.equalsIgnoreCase("Manager")) {
            Manager manager = new Manager();
            manager.acceptDetails();
            manager.displayDetails();
        }

        // Creating object of Worker class
        if (type.equalsIgnoreCase("Worker")) {
            Worker worker = new Worker();
            worker.acceptDetails();
            worker.displayDetails();
        }
    }
}

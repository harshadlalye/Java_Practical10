/* Q4. Write  a  java  program  to  create  abstract  class  person  derived  two  classes 
Employee and Worker from it. Use proper method to accept and display for the 
same. Employee(eno, ename, address), similar fields are worker.  */
abstract class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void accept();

    public abstract void display();
}

class Employee extends Person {
    private int eno;
    private String ename;

    public Employee(String name, String address, int eno, String ename) {
        super(name, address);
        this.eno = eno;
        this.ename = ename;
    }

    public void accept() {
        System.out.println("Enter Employee Details:");
        System.out.print("Employee Number: ");
        eno = Integer.parseInt(System.console().readLine());
        System.out.print("Employee Name: ");
        ename = System.console().readLine();
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
    }
}

class Worker extends Person {
    private int wno;
    private String wname;

    public Worker(String name, String address, int wno, String wname) {
        super(name, address);
        this.wno = wno;
        this.wname = wname;
    }

    public void accept() {
        System.out.println("Enter Worker Details:");
        System.out.print("Worker Number: ");
        wno = Integer.parseInt(System.console().readLine());
        System.out.print("Worker Name: ");
        wname = System.console().readLine();
    }

    public void display() {
        System.out.println("Worker Details:");
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Worker Number: " + wno);
        System.out.println("Worker Name: " + wname);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", "123 Main St.", 1001, "Manager");
        Worker worker = new Worker("Jane Doe", "456 Elm St.", 2001, "Laborer");

        employee.accept();
        employee.display();

        worker.accept();
        worker.display();
    }
}

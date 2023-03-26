/* Q5. Define a class employee having member variable – Emp_No, Emp_Name and 
Designation. Define another class salary which, has been inherited from class 
employee, having member variable Basic_Sal. Write appropriate method which 
will calculate Basic_Sal. Depending on designation and constructor to initialize 
member variable. */
class Employee {
    protected int Emp_No;
    protected String Emp_Name;
    protected String Designation;

    public Employee(int empNo, String empName, String designation) {
        Emp_No = empNo;
        Emp_Name = empName;
        Designation = designation;
    }
}

class Salary extends Employee {
    private int Basic_Sal;

    public Salary(int empNo, String empName, String designation) {
        super(empNo, empName, designation);
        Basic_Sal = calculateBasicSalary();
    }

    private int calculateBasicSalary() {
        switch (Designation) {
            case "Manager":
                return 100000;
            case "Engineer":
                return 80000;
            case "Analyst":
                return 60000;
            default:
                return 0;
        }
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Emp_No: " + Emp_No);
        System.out.println("Emp_Name: " + Emp_Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Basic_Sal: " + Basic_Sal);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Salary salary1 = new Salary(1001, "John Smith", "Manager");
        salary1.display();

        Salary salary2 = new Salary(2001, "Jane Doe", "Engineer");
        salary2.display();
    }
}

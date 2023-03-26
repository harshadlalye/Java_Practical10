/* Q12. Write a Java program:  
 Define Class Employee. Define another two subclasses:  
(a) Temporary Employee Class (b) Permanent Employee Class  
i) Calculate salary for temporary employee depending upon no. of hours 
per month and overtime hours.  
ii) Calculate  salary  for  permanent  employee  depending  upon  no.  of  days 
per month. 
iii) Override calcsal() method  
iv) Write appropriate constructors */
// Define the Employee class
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void calcsal() {
        System.out.println("Salary calculation for employee " + name);
    }
}

// Define the TemporaryEmployee subclass
class TemporaryEmployee extends Employee {
    int hours;
    int overtime;

    public TemporaryEmployee(String name, int id, int hours, int overtime) {
        super(name, id);
        this.hours = hours;
        this.overtime = overtime;
    }

    @Override
    public void calcsal() {
        int salary = hours * 1000 + overtime * 500;
        System.out.println("Salary of temporary employee " + name + " is " + salary);
    }
}

// Define the PermanentEmployee subclass
class PermanentEmployee extends Employee {
    int days;

    public PermanentEmployee(String name, int id, int days) {
        super(name, id);
        this.days = days;
    }

    @Override
    public void calcsal() {
        int salary = days * 500;
        System.out.println("Salary of permanent employee " + name + " is " + salary);
    }
}

// Main class to create employee objects and calculate salary
public class Q12 {
    public static void main(String[] args) {
        // Create a temporary employee object and calculate salary
        TemporaryEmployee t1 = new TemporaryEmployee("John", 101, 20, 5);
        t1.calcsal();

        // Create a permanent employee object and calculate salary
        PermanentEmployee p1 = new PermanentEmployee("Jane", 102, 25);
        p1.calcsal();
    }
}

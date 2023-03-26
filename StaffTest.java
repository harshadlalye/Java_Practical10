/* Q3. Define  class  Staff  with  data  members  as  name,  birth-date,  designation  and 
salary.  Use  constructors  and  method  display  ()  –which  will  display  details  of 
Staff.  Create  two  objects  of  Staff  and  Print  the  name  of  staff  having  highest 
salary  */
class Staff {
    private String name;
    private String birthDate;
    private String designation;
    private double salary;

    public Staff(String name, String birthDate, String designation, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.designation = designation;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class StaffTest {
    public static void main(String[] args) {
        Staff staff1 = new Staff("John Smith", "01-01-1990", "Manager", 50000.0);
        Staff staff2 = new Staff("Jane Doe", "01-01-1995", "Developer", 60000.0);

        staff1.display();
        staff2.display();

        if (staff1.getSalary() > staff2.getSalary()) {
            System.out.println(staff1.getName() + " has the highest salary");
        } else {
            System.out.println(staff2.getName() + " has the highest salary");
        }
    }
}

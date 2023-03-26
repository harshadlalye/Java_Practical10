/* Q.14. Write a Program:
Write abstract class staff with abstract method, calculate salary() and instance method Lint- Data (int no, string name). Write Typist class as sub-class of staff with speed as instance variable, if speed is less than 40, then salary 4000 else 5000. 
Write main class to implement above classes. */
abstract class Staff {
    abstract void calculateSalary();

    void lintData(int no, String name) {
        System.out.println("Staff no: " + no + ", Name: " + name);
    }
}

class Typist extends Staff {
    int speed;

    Typist(int speed) {
        this.speed = speed;
    }

    @Override
    void calculateSalary() {
        if (speed < 40) {
            System.out.println("Salary: 4000");
        } else {
            System.out.println("Salary: 5000");
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Typist typist1 = new Typist(35);
        typist1.lintData(100, "John");
        typist1.calculateSalary();

        Typist typist2 = new Typist(45);
        typist2.lintData(200, "Jane");
        typist2.calculateSalary();
    }
}

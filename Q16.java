
/* Q.16. Write a Program:
Create class passenger. 
Accept details '10' passengers in an array of objects and display the accepted details 
[assume suitable attribute fields]. */
import java.util.Scanner;

class Passenger {
    private String name;
    private int age;
    private String gender;
    private String destination;

    Passenger(String name, int age, String gender, String destination) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Destination: " + destination;
    }
}

public class Q16 {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details of passenger " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Destination: ");
            String destination = sc.nextLine();
            passengers[i] = new Passenger(name, age, gender, destination);
        }

        System.out.println("Details of all passengers:");
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }
}

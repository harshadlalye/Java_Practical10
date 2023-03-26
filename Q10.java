/* Q.10. Write a Java Program
Create an interface Manager with methods show details. Implement the interface for HRManager class. 
In main class create the objects for the concrete classes HRManager and call the method. */
// Define the Manager interface
interface Manager {
    void showDetails();
}

// Implement the Manager interface for the HRManager class
class HRManager implements Manager {
    private String name;
    private int age;

    public HRManager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement the showDetails method from the Manager interface
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Create a main class to test the HRManager class
public class Q10 {
    public static void main(String[] args) {
        // Create an HRManager object and call the showDetails method
        HRManager hrManager = new HRManager("John Smith", 35);
        hrManager.showDetails();
    }
}


/* Q.8. Write a Java Program to
Create an abstract class order having members id and description. 
Create two subclasses PurchaseOrder and Sales Order with member customer name and vendor name respectively. 
Define methods accept and display in all classes. 
Create 5 objects each of PurchaseOrder and SalesOrder. 
Accept and display details. */
import java.util.Scanner;

// Abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    // Abstract method to accept details
    public abstract void accept();

    // Abstract method to display details
    public abstract void display();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    protected String customerName;

    // Method to accept details for PurchaseOrder
    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Order ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Purchase Order Description: ");
        description = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
    }

    // Method to display details for PurchaseOrder
    public void display() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Purchase Order Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

// Subclass SalesOrder
class SalesOrder extends Order {
    protected String vendorName;

    // Method to accept details for SalesOrder
    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Sales Order Description: ");
        description = sc.nextLine();

        System.out.print("Enter Vendor Name: ");
        vendorName = sc.nextLine();
    }

    // Method to display details for SalesOrder
    public void display() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Sales Order Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

// Main class to test the program
public class OrderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating 5 objects of PurchaseOrder
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[5];
        for (int i = 0; i < purchaseOrders.length; i++) {
            System.out.println("Enter details for Purchase Order #" + (i + 1));
            purchaseOrders[i] = new PurchaseOrder();
            purchaseOrders[i].accept();
        }

        // Creating 5 objects of SalesOrder
        SalesOrder[] salesOrders = new SalesOrder[5];
        for (int i = 0; i < salesOrders.length; i++) {
            System.out.println("Enter details for Sales Order #" + (i + 1));
            salesOrders[i] = new SalesOrder();
            salesOrders[i].accept();
        }

        // Displaying details for all PurchaseOrders
        System.out.println("Details of Purchase Orders:");
        for (int i = 0; i < purchaseOrders.length; i++) {
            purchaseOrders[i].display();
            System.out.println();
        }

        // Displaying details for all SalesOrders
        System.out.println("Details of Sales Orders:");
        for (int i = 0; i < salesOrders.length; i++) {
            salesOrders[i].display();
            System.out.println();
        }
    }
}

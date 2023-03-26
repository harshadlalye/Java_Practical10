
/* Q.13 Create class voter with attributes votername, voteraddress, votercontactNo., Voteraddhar, etc. 
Accept details of '10' voters in an array of objects and display the accepted details. */
import java.util.Scanner;

class Voter {
    String votername, voteraddress, votercontactNo, Voteraddhar;

    public Voter(String name, String address, String contactNo, String addhar) {
        votername = name;
        voteraddress = address;
        votercontactNo = contactNo;
        Voteraddhar = addhar;
    }

    public void displayDetails() {
        System.out.println("Name: " + votername);
        System.out.println("Address: " + voteraddress);
        System.out.println("Contact No.: " + votercontactNo);
        System.out.println("Aadhar No.: " + Voteraddhar);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voter[] voters = new Voter[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for voter " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Contact No.: ");
            String contactNo = scanner.nextLine();
            System.out.print("Aadhar No.: ");
            String addhar = scanner.nextLine();

            voters[i] = new Voter(name, address, contactNo, addhar);
        }

        System.out.println("\nDetails of the 10 voters:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Voter " + (i + 1) + ":");
            voters[i].displayDetails();
            System.out.println();
        }
    }
}

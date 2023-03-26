/* Q.1. Define class Bank with data members as Cust_name, Ac_no and balance. Use 
constructors and method withdraw and deposit. Print the balance according to 
operation.  */
public class Bank {
    private String custName;
    private String acNo;
    private double balance;

    // Constructors
    public Bank(String custName, String acNo, double balance) {
        this.custName = custName;
        this.acNo = acNo;
        this.balance = balance;
    }

    // Methods
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        Bank myBank = new Bank("John Smith", "123456789", 1000.0);
        myBank.deposit(500.0);
        myBank.withdraw(200.0);
        myBank.withdraw(1500.0);
    }
}
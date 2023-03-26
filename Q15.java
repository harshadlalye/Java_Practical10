/* Q.15. Write a program:
Write an interface to define method to calculate compound Interest (), which takes three arguments, First- amount, second- no. of years & three-rate of interest. 
Implement this interface to demonstrate the functionality. */
interface InterestCalculator {
    double calculateCompoundInterest(double amount, int years, double rate);
}

class InterestCalculatorImpl implements InterestCalculator {
    @Override
    public double calculateCompoundInterest(double amount, int years, double rate) {
        double interestRate = rate / 100.0;
        double compoundedInterest = amount * Math.pow((1 + interestRate), years);
        return compoundedInterest;
    }
}

public class Q15 {
    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculatorImpl();
        double amount = 10000;
        int years = 5;
        double rate = 8.5;
        double compoundInterest = calculator.calculateCompoundInterest(amount, years, rate);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

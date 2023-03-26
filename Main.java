
/* Q6. Create two packages, pack1 contains two classes as student and course. Both classes have method to read corresponding information. Pack2 contains class college with method accept(). Write a Java program to display all details */
import pack1.*;
import pack2.*;

public class Main {
    public static void main(String[] args) {
        College college = new College(2, 3);
        college.accept();
        college.display();
    }
}
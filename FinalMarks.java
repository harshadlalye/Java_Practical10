/* Q2. Define class student with attribute rollno , name. Inherit student class in a class 
called Marks, with attributes marks of Java Theory and Java Practical. Define 
method  setMark()  in  Mark  class  marks  and  set  the  total  of  Java  marks  in 
setmark() method, Show the Java Marks in main class called FinalMarks.  
(Take the Marks from system.) */
class Student {
    protected int rollno;
    protected String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

class Marks extends Student {
    private int javaTheory;
    private int javaPractical;
    private int javaTotal;

    public Marks(int rollno, String name) {
        super(rollno, name);
    }

    public void setMark(int javaTheory, int javaPractical) {
        this.javaTheory = javaTheory;
        this.javaPractical = javaPractical;
        this.javaTotal = javaTheory + javaPractical;
    }

    public int getJavaTotal() {
        return javaTotal;
    }
}

public class FinalMarks {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter Java Theory marks: ");
        int javaTheory = scanner.nextInt();

        System.out.print("Enter Java Practical marks: ");
        int javaPractical = scanner.nextInt();

        Marks marks = new Marks(rollno, name);
        marks.setMark(javaTheory, javaPractical);

        System.out.println("Java Total marks: " + marks.getJavaTotal());
    }
}

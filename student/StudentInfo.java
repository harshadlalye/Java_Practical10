// StudentInfo.java
package student;

public class StudentInfo {
    private int rollNo;
    private String name;
    private String className;
    private float percentage;

    public StudentInfo(int rollNo, String name, String className, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage + "%");
    }
}

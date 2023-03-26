package pack2;

import pack1.*;

public class College {
    private Student[] students;
    private Course[] courses;

    public College(int numStudents, int numCourses) {
        this.students = new Student[numStudents];
        this.courses = new Course[numCourses];
    }

    public void accept() {
        for (int i = 0; i < this.students.length; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            Student student = new Student();
            student.readInfo();
            this.students[i] = student;
        }

        for (int i = 0; i < this.courses.length; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + ":");
            Course course = new Course();
            course.readInfo();
            this.courses[i] = course;
        }
    }

    public void display() {
        System.out.println("\nStudents:");
        for (int i = 0; i < this.students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println(this.students[i].toString());
        }

        System.out.println("\nCourses:");
        for (int i = 0; i < this.courses.length; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");
            System.out.println(this.courses[i].toString());
        }
    }
}
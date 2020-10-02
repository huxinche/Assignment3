package edu.neu.info5100;

public class Course {
    private String name;
    private int numberOfStudent;
    private static int MAX_STUDENT = 10;
    private Student[] students;

    public Course(String name) {
        this.name = name;
        students = new Student[MAX_STUDENT];
    }

    public Course() {
        students = new Student[MAX_STUDENT];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean isFull() {
        return numberOfStudent == 10;
    }

    public boolean registerStudent(Student student) {
        if (!this.isFull()) {
            students[numberOfStudent] = student;
            return true;
        }
        return false;
    }
}


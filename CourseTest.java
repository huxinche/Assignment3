package edu.neu.info5100;

import java.util.Scanner;

class CourseTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the edu.neu.info5100.Student and edu.neu.info5100.Course Register System!");
        System.out.println("Please input the name of the course: ");
        String courseName = scanner.nextLine();
        Course course = new Course(courseName);
        System.out.println("edu.neu.info5100.Course is created done! ");
        while (true) {
            if (!course.isFull()) {
                System.out.println("Please input the name of the added student: ");
                String name = scanner.nextLine();
                System.out.println("Please input the id of the added student: ");
                String id = scanner.nextLine();
                Student student = new Student(name, id);
                course.registerStudent(student);
                System.out.println("edu.neu.info5100.Student is registered done! ");

            } else {
                System.out.println("The course is full, please run again!");
                break;
            }
            System.out.println("Do you want to add next one?(Type N as No, Y as Yes)");
            String next = scanner.nextLine();
            if (next.equalsIgnoreCase("N")) {
                System.out.println("Bye! ");
                break;

            }

        }
        System.out.printf("The number of students in %s is %s. %n", course.getName(), course.getNumberOfStudent());
        Student[] students = course.getStudents();
        System.out.println("Here are these student: ");
        for (int i = 0; i < course.getNumberOfStudent(); i++) {
            System.out.println(students[i].getId() + ": " + students[i].getName());
        }
        scanner.close();
    }
}

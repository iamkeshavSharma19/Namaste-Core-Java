import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    public Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public void displayStudent() {
        System.out.println("-----------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("-----------------------------");
    }

    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        addSampleStudents();

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverageMarks();
                    break;

                case 5:
                    findTopStudent();
                    break;

                case 6:
                    deleteStudent();
                    break;

                case 7:
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    public static void displayMenu() {

        System.out.println();
        System.out.println("========== MENU ==========");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Calculate Average Marks");
        System.out.println("5. Find Top Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Exit");
        System.out.println("==========================");
    }

    public static void addSampleStudents() {

        students.add(
            new Student(101, "Keshav", 22, "Computer Science", 89.5)
        );

        students.add(
            new Student(102, "Rahul", 21, "Information Technology", 76.0)
        );

        students.add(
            new Student(103, "Aman", 23, "Computer Science", 92.0)
        );

        students.add(
            new Student(104, "Priya", 21, "Electronics", 84.5)
        );
    }

    public static void addStudent() {

        System.out.println();
        System.out.println("====== ADD STUDENT ======");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(
            id,
            name,
            age,
            course,
            marks
        );

        students.add(student);

        System.out.println();
        System.out.println("Student added successfully!");
    }

    public static void displayAllStudents() {

        System.out.println();
        System.out.println("====== ALL STUDENTS ======");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public static void searchStudent() {

        System.out.println();
        System.out.println("====== SEARCH STUDENT ======");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        boolean found = false;

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("Student found!");
                student.displayStudent();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void calculateAverageMarks() {

        System.out.println();
        System.out.println("====== AVERAGE MARKS ======");

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double totalMarks = 0;

        for (Student student : students) {
            totalMarks += student.getMarks();
        }

        double average = totalMarks / students.size();

        System.out.println("Total Students : " + students.size());
        System.out.println("Total Marks    : " + totalMarks);
        System.out.println("Average Marks  : " + average);
    }

    public static void findTopStudent() {

        System.out.println();
        System.out.println("====== TOP STUDENT ======");

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student student : students) {

            if (student.getMarks() > topStudent.getMarks()) {
                topStudent = student;
            }
        }

        System.out.println("Top Student:");
        topStudent.displayStudent();
    }

    public static void deleteStudent() {

        System.out.println();
        System.out.println("====== DELETE STUDENT ======");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student studentToDelete = null;

        for (Student student : students) {

            if (student.getId() == id) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {

            students.remove(studentToDelete);

            System.out.println(
                "Student deleted successfully!"
            );

        } else {

            System.out.println(
                "Student with ID " + id + " not found."
            );
        }
    }
}
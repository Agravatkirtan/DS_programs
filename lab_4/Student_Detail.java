package programs.lab_4;

import java.util.Scanner;

public class Student_Detail {
    int enrollmentNo;
    String name;
    int semester;
    double cpi;

    public Student_Detail(int enrollmentNo, String name, int semester, double cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public double getCPI() {
        return cpi;
    }

    public void displayDetails() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student_Detail[] students = new Student_Detail[5];

        System.out.println("Enter details for 5 students:");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Enter Enrollment No: ");
            int enrollmentNo = scanner.nextInt();

            System.out.print("Enter Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int semester = scanner.nextInt();

            System.out.print("Enter CPI: ");
            double cpi = scanner.nextDouble();

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
            System.out.println();
        }

        System.out.println("Details of the students:");
        for (Student_Detail student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}

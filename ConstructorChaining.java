//Online Course Enrollment System
package CoreJava;

import java.util.Scanner;

class Course {

    String studentName;
    String courseName;
    int duration;
    double courseFee;

    // Default constructor
    Course() {
        this("Unknown", "Not Selected", 0, 0);
    }

    // Parameterized constructor
    Course(String studentName, String courseName,
           int duration, double courseFee) {

        this.studentName = studentName;
        this.courseName = courseName;
        this.duration = duration;
        this.courseFee = courseFee;
    }

    void displayCourseDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration     : " + duration + " months");
        System.out.println("Course Fee   : ₹" + courseFee);
    }
}


// Child class
class PremiumCourse extends Course {

    String mentorName;
    double discount;

    // Default constructor
    PremiumCourse() {
        this("Unknown", "Not Selected", 0, 0,
             "Not Assigned", 0);
    }

    // Parameterized constructor
    PremiumCourse(String studentName, String courseName,
                  int duration, double courseFee,
                  String mentorName, double discount) {

        super(studentName, courseName, duration, courseFee);

        this.mentorName = mentorName;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return courseFee - (courseFee * discount / 100);
    }

    void displayPremiumCourse() {

        displayCourseDetails();

        System.out.println("Mentor Name  : " + mentorName);
        System.out.println("Discount     : " + discount + "%");
        System.out.println("Final Fee    : ₹" + calculateFinalFee());
    }
}


public class ConstructorChaining {  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("    ONLINE COURSE ENROLLMENT");
        System.out.println("=================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Duration (months): ");
        int duration = sc.nextInt();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Mentor Name: ");
        String mentor = sc.nextLine();

        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();

        PremiumCourse p = new PremiumCourse(
                name, course, duration, fee,
                mentor, discount
        );

        System.out.println("\n========== COURSE DETAILS ==========");

        p.displayPremiumCourse();

        System.out.println("\nEnrollment completed successfully!");

        sc.close();
    }
}
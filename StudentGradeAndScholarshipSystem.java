import java.util.Scanner;

public class StudentGradeAndScholarshipSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int scholarship = 0;

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }
        else {

            System.out.print("Enter your category (1.General, 2.OBC, 3.SC/ST): ");
            int category = sc.nextInt();

            if (category == 1 || category == 2 || category == 3) {

                switch (category) {

                    case 1:
                        if (marks >= 90) {
                            scholarship = 20000;
                        }
                        else if (marks >= 75) {
                            scholarship = 10000;
                        }
                        else {
                            scholarship = 0;
                        }
                        break;

                    case 2:
                        if (marks >= 85) {
                            scholarship = 25000;
                        }
                        else if (marks >= 70) {
                            scholarship = 15000;
                        }
                        else {
                            scholarship = 0;
                        }
                        break;

                    case 3:
                        if (marks >= 75) {
                            scholarship = 30000;
                        }
                        else if (marks >= 60) {
                            scholarship = 20000;
                        }
                        else {
                            scholarship = 0;
                        }
                        break;
                }

                System.out.println("Scholarship: ₹" + scholarship);

            }
            else {
                System.out.println("Invalid Category");
            }
        }

        sc.close();
    }
}
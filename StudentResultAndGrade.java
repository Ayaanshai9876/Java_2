import java.util.Scanner;

public class StudentResultAndGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for first subject:");
        int sub1=sc.nextInt();
        System.out.print("Enter marks for second subject:");
        int sub2=sc.nextInt();
        System.out.print("Enter marks for third subject:");
        int sub3=sc.nextInt();
        float avg=(sub1+sub2+sub3)/3.0f;
        String result=(sub1<33 || sub2<33 || sub3<33) ? "Fail":(avg>=90) ? "Grade A":(avg>=75) ? "Grade B":(avg>=60) ? "Grade C":(avg>=45) ? "Grade D":"Grade E";
        System.out.println(result);
    }
}

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first integer:");
        int a= sc.nextInt();
        System.out.print("Enter second integer:");
        int b= sc.nextInt();
        System.out.print("Enter third integer:");
        int c= sc.nextInt();
        int largest=(a>b && a>c) ? a: (b>a && b>c) ? b: c;
        System.out.println("Largest="+largest);
    }
}

import java.util.Scanner;

public class InputandOutput {
    static void main(){
        Scanner sc = new Scanner(System.in);// create object(sc) of scanner which is needed for taking input
        System.out.print("Enter the value for firstBNum: ");
        int a =sc.nextInt();
        System.out.print("Enter the value for secondBNum: ");
        int b =sc.nextInt();
        int c=a+b;
        System.out.println("Sum:"+c);
        boolean ss=sc.nextBoolean();
        float v= sc.nextFloat();
        short vb=sc.nextShort();
        System.out.println(vb);
        System.out.print("Enter a character:");
        String abv=sc.next();// input single word string
        System.out.println("Entered char:"+abv);
System.out.print("Enter a string:");
String az=sc.nextLine(); // whole line string
       System.out.print(az);
//printf(formatted ouput0) %d,%f,%s are placeholders it will replace with values like mentioned below
        System.out.print("name:");
        String name=sc.nextLine();
        System.out.print("Enter your grade:");
float grade =sc.nextFloat();
System.out.printf("name: %s, grade: %.1f",name,grade);
//String concantenation
        String userName="Riya";
        int contestCount=12;
        System.out.println("Hello"+" "+contestCount);
        System.out.println("Contest Attended:"+contestCount);
sc.close();
    }
}

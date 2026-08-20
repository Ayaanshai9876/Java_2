import java.util.Scanner;

public class passcheck {
    static void main(){
        Scanner sc= new Scanner(System.in);
        String pass= sc.nextLine();
        if(pass =="Java123"){
System.out.println("Access Granted");
        }
        else{
            System.out.println("Access not gramted");
        }
}}

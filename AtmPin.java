import java.util.Scanner;

public class AtmPin {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int atmPin=sc.nextInt();
        if(atmPin!=1234){
            System.out.println("Session TERMINATED");
        }
        else{
            System.out.print("How much money do you want:");
            int money=sc.nextInt();
            int balance=10000;
            if(money<=balance){
                System.out.print("transaction successfull");
            }
            else{
                System.out.print("Insuffient funds");
            }
        }
    }
}

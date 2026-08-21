import java.util.Scanner;

public class PostiveOrNegative {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        String ans=(a>0) ? ("Positive"):(a<0) ? ("Negative"): ("Zero");
    System.out.println(ans);
    }
}

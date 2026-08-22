import java.util.Scanner;

public class AtmBalance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance=sc.nextDouble();
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        System.out.print("Enter you wish: ");
        int wish=sc.nextInt();
        switch (wish){
            case 1:
                System.out.println("Balance:"+balance);
                break;

            case 2:
                System.out.print("Enter money to deposit: ");
                int deposit=sc.nextInt();
                balance+=deposit;
                System.out.println("Updated Balance:"+balance);
                break;

            case 3:
                System.out.println("Enter withdrawl amount:");
                int withdraw=sc.nextInt();
                if(withdraw<=balance){
                    balance-=withdraw;
                    System.out.println("Updated balance:"+balance);}
                    else {
                        System.out.println("Insuffiencet balance");
                    }
                    break;
            case 4:
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Invalid choice");

                }
        }
    }


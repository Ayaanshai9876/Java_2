import java.util.Scanner;

public class RestaurantBillingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total=0;

        System.out.println("1.Burger:120");
        System.out.println("2.Pizza:250");
        System.out.println("3.Pasta:180");
        System.out.println("4.Sandwich");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice) {

            case 1:
                System.out.print("Enter quantity: ");
                int burger = sc.nextInt();
                total = 120 * burger;
                System.out.println("Final Bill: ₹" + total);
                break;

            case 2:
                System.out.print("Enter quantity: ");
                int pizza = sc.nextInt();
                total = 250 * pizza;
                System.out.println("Final Bill: ₹" + total);
                break;

            case 3:
                System.out.print("Enter quantity: ");
                int pasta = sc.nextInt();
                total = 180 * pasta;
                System.out.println("Final Bill: ₹" + total);
                break;

            case 4:
                System.out.print("Enter quantity: ");
                int sandwich = sc.nextInt();
                total = 100 * sandwich;
                System.out.println("Final Bill: ₹" + total);
                break;

            case 5:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice");
        }
//without switch case it will be easy
        int burgerQty = sc.nextInt();
        int pizzaQty = sc.nextInt();
        int pastaQty = sc.nextInt();
        int sandwichQty = sc.nextInt();

        int total1 = burgerQty * 120
                + pizzaQty * 250
                + pastaQty * 180
                + sandwichQty * 100;
        sc.close();
    }
}


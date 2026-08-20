import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ₹");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000) {
            tax = 0;
        }
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        }
        else if (income <= 1000000) {
            tax = 12500 + (income - 500000) * 0.20;
        }
        else {
            tax = 112500 + (income - 1000000) * 0.30;
        }

        System.out.println("Final Tax Amount: ₹" + tax);

        sc.close();
    }
}

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a senior citizen?: ");
        boolean isSeniorCitizen = sc.nextBoolean();

        System.out.print("UNITS CONSUMED: ");
        int units = sc.nextInt();

        float totalBill = 0;

        if (units <= 0) {
            System.out.println("Invalid units");
        }
        else {

            if (units <= 100) {
                totalBill = units * 2;
            }
            else if (units <= 200) {
                units -= 100;
                totalBill = 200 + (units * 3);
            }
            else if (units <= 300) {
                units -= 200;
                totalBill = 500 + (units * 5);
            }
            else {
                units -= 300;
                totalBill = 1000 + (units * 7);
            }

            if (totalBill > 2000) {
                totalBill = totalBill + (totalBill * 0.05f);
            }

            if (isSeniorCitizen) {
                totalBill = totalBill - (totalBill * 0.10f);
            }

            System.out.println("Final Bill: ₹" + totalBill);
        }

        sc.close();
    }
}

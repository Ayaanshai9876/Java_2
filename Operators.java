public class Operators {
    public static void main() {
        //Arthmetic operators
        int num1 = 23;
        int num2 = 6;
        int total = num1 + num2;
        int diff = num1 - num2;
        int diff1 = num2 - num1;
        int pro = num1 * num2;
        int quo = num1 / num2;
        double quo2 = (double) num2 / num1;
        int modulo = num1 % num2;
        System.out.println(total);
        System.out.println(diff);
        System.out.println(diff1);
        System.out.println(pro);
        System.out.println(quo);
        System.out.println(quo2);
        System.out.println(modulo);
        //If any one operand is long whole expression becomes long
        //if any operand is float whole expresiion becomes float
        //same goes for double
        //assignment opera


        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30

        System.out.println(ratingPoints);

        //realtional


        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        //Logical Operators


                boolean completedDSA = true;
                boolean completedCore = false;

                System.out.println(completedDSA && completedCore);
                System.out.println(completedDSA || completedCore);
                System.out.println(!completedCore);
                // unary


                int activeUsers = 100;

                int prefix = ++activeUsers;
                int postfix = activeUsers++;

                System.out.println(prefix);
                System.out.println(postfix);
                System.out.println(activeUsers);
            }
        }








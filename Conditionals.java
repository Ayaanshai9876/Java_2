import java.util.Scanner;
public class Conditionals {
    static void main(){
        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter your Name:");
//        String name=sc.nextLine();
//        System.out.print("Enter your age:");
//        int age=sc.nextInt();
//        //if
//        if(age>=18){
//            System.out.printf("%s is eligible to vote",name);// if conditojn true then only inside block of code runs
//        }
//        //if else
//        if(age>=18) System.out.printf("%s can vote",name);// executes if cond is true
//        else System.out.printf("%s can not vote",name);//executes if conditon is false
////if else ladder(used for multiple conditions)
//        int a=sc.nextInt();
//        if(a==10) System.out.println(("ten"));
//        else if (a>=10) {
//            System.out.println("greater");
//        }
//        else {
//            System.out.println("less");
//        }
//        //nested if else
//                boolean hasSubscription = true;
//                int solvedProblems = 220;
//
//                if (hasSubscription) {
//
//                    if (solvedProblems >= 200) {
//                        System.out.println("Unlock Advanced Sheet");
//                    } else {
//                        System.out.println("Practice More Problems");
//                    }
//
//                } else {
//                    System.out.println("Upgrade to Premium");
//                }
//                int age=10;
//                int ans=(age>=10) ? 22:12;
//                System.out.println(ans);
                int dayNumber = sc.nextInt();

                switch (dayNumber) {
                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    case 3:
                        System.out.println("Wednesday");
                        break;

                    default:
                        System.out.println("Invalid day");
                }
            }
        }





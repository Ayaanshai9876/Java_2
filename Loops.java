import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //LOOPS
        //1.FOR LOOP
        for (int i=0;i<=5;i++){
            System.out.println(i);}
        System.out.println();//one line skip
        //1-10 odd num
            for(int j=1;j<=10;j+=2){
                System.out.println(j);
            }
            //1-n even num
        int n= sc.nextInt();
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
        //nested loops
        for(int i=1;i<=3;i++){ //rows
            for(int j=1;j<=3;j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
        //break
        for(int i=1;i<=9;i++){
            if(i==8) break;// will move u out of loop completely(from current iteration to further last loop will not exexute body of code)
            System.out.print(i+" ");
        }
        for(int i=1;i<=10;i++){
            if(i==4) continue;
            System.out.println(i);//will skip that iteratiojn and move to updation and loop will continue further
        }
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            if(i==3) continue;// will not run below code after continue statement at i==3(as i said it will move to updation
            System.out.println(i);
        }
        //while
        int i=1;//ini
        while(i<=5){
            System.out.println("Ayaansh");
            i++;//updation
        }
        //do while
        int z=8;
        do{
            System.out.println(z);//will run atleat once as condition starts checking after 1 iteration
            z++;
        }while(z<=5);
        }
    }


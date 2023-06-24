import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        // int counter = 1;
        // do{
        // System.out.println("hello arpita");
        // counter++;
        // }while(counter<=5);
        // int sum;
        // int number = 10899;
        // // for(int i=number;i<=number.length();i++){
        // do{

        // sum = number % 10;
        // System.out.print(sum);
        // number = number / 10;
        // // n = number % 10;

        // }while(number>0);

        // System.out.println();

        // continue statement

        // for(int i=1;i<=5;i++){
        // if(i==3)
        // continue;
        // System.out.println(i);
        // }

        // example (display all numbers entered by user except multiplies of 10)

        // for(int i=1;i<=n;i++){
        // do{
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n= scan.nextInt();
        // if(n%10==0){
        // continue;
        // }
        // System.out.println("the number was: "+n);
        // }while(true);



        //Example -- using break (keep entering nos. till user enters a multiple of 10)
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = scan.nextInt();
            scan.close();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("the number was: " + n);
        } while (true);

    }

}

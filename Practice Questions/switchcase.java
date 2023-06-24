import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        // int number = 2;
        // switch (number) {
        //     case 1:
        //         System.out.println("samosa");
        //         break;
        //     case 2:
        //         System.out.println("kabab");
        //         break;
        //     case 3:
        //         System.out.println("mango shake");
        //     default:
        //         System.out.println("we wake up");

        //Calculator
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=scan.nextInt();
        System.out.println("enter 2nd number:");
        int b=scan.nextInt();
        //int number;

System.out.println("enter operator:");
char ch=scan.next().charAt(0);
scan.close();
        switch(ch){

            case '+':
            System.out.println("addition is: "+(a+b));
            break;
            case '-':
            System.out.println("substraction is: "+(a-b));
            break;
            case '*':
            System.out.println("multiplication is: "+(a*b));
            break;
            case '/':
            System.out.println("division is: "+(a/b));
            break;
            case '%':
            System.out.println("module is: "+(a%b));
            break;
            default:
            System.out.println("wrong choice");

        }
        }
    }



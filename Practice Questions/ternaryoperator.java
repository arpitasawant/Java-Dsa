import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args){
        int number=4;
        //ternary operator=(condition) ? statement1:statement2
        //syntax: variable
        String type = (number%2 == 0)?"even":"odd";
        System.out.println(type);

        int marks;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks=scan.nextInt();
        String type1 = (marks>=33)?"pass":"fail";
        System.out.println(type1);
        scan.close();
    }
}

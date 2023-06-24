import java.util.Scanner;

public class loopsquestions {
   public static void main(String[] args) {
      // Q1) how many times hello is printed?

      for (int i = 0; i < 5; i++) {
         System.out.println("hello");
         i += 2;
      }

      // Q2) write a program that reads a set of integers,and then prints
      // the sum of even and odd integers

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number(enter 0 to stop):");
      int sumodd = 0, sumeven = 0;
      while (scan.hasNextInt()) {

         int number = scan.nextInt();
         if (number % 2 == 0) {
            sumeven += number;
         }

         if (number % 2 != 0) {
            sumodd += number;

         }
         if (number == 0) {
            break;
         }
      }
      System.out.println("sum of even numbers: " + sumeven);
      System.out.println("sum of odd numbers: " + sumodd);

      // Q3) factorial number

      System.out.println("Enter the number: ");
      int factorial = scan.nextInt();

      int f = 1;
      for (int i = 1; i <= factorial; i++) {
         f = f * i;

      }
      System.out.println("Factorial is: " + f);

      // Q4)write a program to print the multiplication table of a number n,
      // entered by the user

      int multiplication = scan.nextInt();
      for (int i = 1; i <= 10; i++) {
         int multiply = i * multiplication;
         System.out.println(multiplication + "x" + i + "=" + multiply);
      }
   }

}

import java.util.Scanner;

public class functions {

    public static int printhelloworld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 2;
    }

    // -------Addition of two numbers

    // public static int add(int a , int b) { //parameters or formal parameters -
    // definition
    // int c = a + b;

    // return c;
    // }

    // -------swaping--------

    // public static void swap(int a, int b) {
    // int temp = b;
    // b = a;
    // a = temp;
    // System.out.println("The value of a after swaping : " + a);
    // System.out.println("The value of b after swaping: " + b);

    // }

    // call by value (it will return a=5 because a=10 outside the function is not
    // validated)

    // public static void changeA(int a) {
    // a = 10;
    // }

    //--------- Multiplication

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    //----------Factorial using function----
    public static void factorial(int n) {
        int f=1;
        //int n;
        for(int i=1;i<=n;i++){
f=f*i;
//n++;
        }
System.out.println("The factorial is: "+f);
    }

 //--------print prime numbers from 1 to n
  public static boolean primeno(int n) {
    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
 } 

//------prime numbers in range

public static void primeinrange(int n) {
   
    for(int i=2;i<=n;i++){
        if(primeno(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();
   
 } 
    

    public static void main(String[] args) {
        printhelloworld(); // function calls
        Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        
        // System.out.println("enter the number: ");
        // int n = scan.nextInt();
         scan.close();
        // swap(a, b); // arguments (a,b) - when function is call
        // System.out.println("addition of a and b is: "+c);
        int a = 5;
        // changeA(a);
        factorial(4);
        int c = multiply(5,7);
        System.out.println(c);
        System.out.println(a);
        System.out.println(primeno(5));
        primeinrange(30); //2  to 30
    }
}


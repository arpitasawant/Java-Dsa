

public class functionoverloading {

    // Function overloading -same function name different parameters

    //-------Function overloading using parameters

    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    //fun overloading using datatypes
    
    //fun to calculate int sum
    
    public static int sum(int a,int b) {
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static boolean isprime(int n){

       // boolean isprime = true;

        for(int i=2;i<=n-1;i++){
            if(n%i==0)//completely dividing
            {
                //isprime = false;
               // return isprime;
               return false;
            }
           
        
          
        } return true;
    }

    //convert binary to decimal
public static void binarytodec(int binaryno) {
    int pow = 0;
    int mynum = binaryno;
    int decnum= 0;
    while(binaryno>0){
        int lastdigit  = binaryno % 10;
        decnum = decnum + (lastdigit * (int)Math.pow(2,pow));
        pow++;
        binaryno = binaryno/10;
    }
    System.out.println("binary number is"+mynum+"="+decnum);
}

//------conversion of decimal to binary
public static void dectobinary(int decno) {
     int binary=0;
     int n = decno;
     int pow=0;
    while(decno>0){
      
      int  rem = decno % 2 ;
     
binary = binary +( rem * (int)Math.pow(10, pow));
pow++;
        decno = decno/2;
        
}
System.out.println("decimal number is: "+n+"="+binary);
    }
    
   
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5.6f,8.5f));
        System.out.println(isprime(2));
        binarytodec(101);
        dectobinary(11);
    }
}

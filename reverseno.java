import java.util.Scanner;

public class reverseno {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
      //   int n=scan.nextInt();
      //   scan.close();
      //   int sum=0;
      //   n=n%10;
      //   sum=sum/10+sum;
      // int c=sum;
      //   System.out.print("Reverse number: "+n);
      int sum=0;
      int number = 12323;
      int temp = number;
      int r;
      while(number>0){
        r = number%10;
        sum = (sum*10)+r;
        
        number = number/10;
      } System.out.print(sum);
      if(temp == sum){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not");
      }
  }
}

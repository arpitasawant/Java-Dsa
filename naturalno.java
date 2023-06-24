import java.util.Scanner;

public class naturalno {
    public static void main(String[] args){
       int sum=0;
        System.out.println("Enter the number: ");        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int val=1;val<=n;val++){
            sum=sum+val;
            
        }System.out.println("Sum of"+n+"natural no. is:"+sum);
    }
}

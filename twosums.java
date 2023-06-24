import java.util.Scanner;

public class twosums{
    public static void main(String[] args){
       int n;
        int[] arr=new int[5];
        Scanner scan=new Scanner(System.in);
     
      System.out.println("enter elements: "); 
      n=scan.nextInt();
       //scan.close();
        for(int i=0;i<n;i++){
           arr[i]=scan.nextInt();
            //System.out.println(n[i]);
        }
        System.out.println("elements are: ");
        for(int i=1;i<n;i++){
            System.out.println("target="+arr[i]);
        
        
    } System.out.println("hello");
   
}}
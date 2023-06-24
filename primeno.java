import java.util.Scanner;

public class primeno {
    public static void main(String[] args){
  
Scanner scan=new Scanner(System.in);
System.out.println("enter the number: ");
int n=scan.nextInt();
scan.close();
        //      int m=0,flag=0;
        //      m=n/2;
        //      if(n==0||n==1){
        //          System.out.println(n +"not a prime number");
        //      }
        //      else{
        //          //for(int i=2;i<=m;i++){
        //              if(n%m==0){
        //                  System.out.println(n +"not a prime number");
        //                  flag=1;
                     
        //          }if(flag==0){
        //              System.out.println(n +" is a prime number");
        //          }
        //      }
        int div = 2;
        while(div<n){
        if(div<n){
            System.out.println("prime");
        
         }
          else{
                if(n%div==0){
                System.out.println("This is not a prime number");
               // flag=1;
                break; 
                }
                else{
                div=div+1;
                // if(div==n){

                //}
            }  
            }
            }
            
              //System.out.println("this is prime no");       
       // System.out.println("this is not a prime number");
        }
// for(div=2;div<n;div++){
//     if(n%div==0){
//         System.out.println("not prime");
//     }
//     else{
//         div=div+1;
//         System.out.println("prime");
//     }
// }


           }    
           
    


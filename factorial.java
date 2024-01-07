import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
int n,f=1;

Scanner scan=new Scanner(System.in);

System.out.println("enter the no: ");
n=scan.nextInt();
scan.close();
for(int i=1;i<=n;i++){
    f=f*i;
   
}     System.out.print(f);


// char c='B';
// for(int i=1;i<=7;i++){
//     for(int j=1;j<=7-i;j++){
//          System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//          System.out.print(c+" ");
//          c++;
//     }
   
   


 System.out.println();
    }}
}

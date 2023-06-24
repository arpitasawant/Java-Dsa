import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        
        int n=scan.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i)-1;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i)-1;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
      // }
// int a = 1;
//         for(int i=1;i<=n;i++){ 
//              int k=0;
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=a;j++){
              
//                 if(j<=i){
//                     k=k-1;
//                 }
//                 else{
//                     k=k+1;
//                 }
//                 System.out.print(j);
               
//             }
//             System.out.println();
//             a=a+2;
//         }
int j;
for(int i=1;i<=n;i++){
    for( j=n-1;j>=i;j--){
        System.out.print(" ");
    }
    for( j=i;j>=1;j--){
         System.out.print(j);
       //  j=j+2;
      
    }
   
   for( j=j+2;j<=i;j++){
    System.out.print(j);
   }
System.out.println();

    }
    for(int i=n-1;i>=1;i--){
        for( j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for( j=i;j>=1;j--){
             System.out.print(j);
        }
       
       for( j=j+2;j<=i;j++){
        System.out.print(j);
       }
    System.out.println();
    
        }
}
}

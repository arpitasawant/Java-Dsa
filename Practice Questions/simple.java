import java.util.*;


public class simple {
    // public static int fact(int n){
    //     int f = 1;
    //     for(int i=1;i<=n;i++){
    //         f=f*i;
    //     }
    //     System.out.println(f);
    //     return n;
    // }

    public static String conveString(String s){
        int n=s.length();
        char[] ch = s.toCharArray();
        int c = 0;
        int ctr=0;
        for(int i =0;i<n;i++){
            if(i==0){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            if(ch[i] == ' '){
                System.out.println(" ");
            }
            if(ch[i] == ' '){
                ctr++;
                ch[i+1] = Character.toUpperCase(ch[i+1]);
               
                continue;
            }
            else{
                ch[c++] = ch[i];
            }
        }
        // return String.valueOf(ch, 0, n-ctr);
        return String.copyValueOf(ch, 0, n-ctr);
    }
    public static void main(String[] args) {
    //    String name = "arpita";
    //    String nstr = "";
    //     for( int i =0 ;i<name.length();i++){
    //        char ch = name.charAt(i);
    //        nstr = ch + nstr; 
    //         System.out.println(ch);
    //     }
        // fact(4);

//         String name = "geekkeeg";
//         System.out.println(name);
//         String n ="";
//          char a ;
// for(int i =name.length()-1;i>=0;i--){
//    n = n+name.charAt(i);;
 
    
    
// }
// System.out.println(n);
// if(name.equals(n)){
// System.out.println("palindrome");
// }
// else{
//     System.out.println("not");
// }

// int a=0,b=1;
// System.out.print(a+" "+b+" ");
// // Scanner scan = new Scanner(System.in);

// // int number = scan.nextInt();
// for(int i = 1;i<=6;i++){
  
//     int k = a + b; a = b;
//     b=k;
   
//    System.out.print(" "+k+" ");
// }

// String str = conveString("hello world");
// System.out.println(str);
// int a = 10;
// int b = 20;
// int k =b;
// b=a;
// a=k;
// System.out.println(a+" "+b);

// int[] arr = {4,5,7,2,474,66};
// int max = Integer.MIN_VALUE;

// for(int i=0;i<arr.length;i++){
//     if(arr[i] > max){
// max=arr[i];
//     }
// }
// System.out.println(max);

// int n = 5;
// for(int )
// Random ran = new Random();
// // for(int i = )
// System.out.println(ran.nextInt(100));

int evencount=0,oddcount=0,zero=0;
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
while(number>0){
    if(number % 10 ==0){
        zero++;
    }
    else if(number % 2==0){
        evencount++;
    }
    else{
        oddcount++;
    }
    number=number/10;
}
System.out.println(zero+" "+evencount+" "+oddcount+" ");
    }
}

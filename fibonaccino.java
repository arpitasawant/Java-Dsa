public class fibonaccino {
    
static void fibo(){
 int a=0,b=1,k,count=10;
 System.out.println(a+" "+b);
 for(int i=2;i<=count;i++){
 k=a+b;
 System.out.println("  "+ k );
 a=b;
 b=k;
}
}
    public static void main(String[] args) {
        // int a = 0, b = 1, k, count = 10;
        // System.out.print(a + " " + b);
        // for (int i = 2; i <= count; i++) {
        //     k = a + b;

        //     System.out.print(" " + k);
        //     a = b;
        //     b = k;
fibo();
int numbers[] = {2,4,5,6};
int sum=1;
for(int i=0;i<numbers.length;i++){
    sum=sum+numbers[i];
    System.out.print(numbers[i]);
} 
System.out.println("sum is:"+sum);
        }

    }


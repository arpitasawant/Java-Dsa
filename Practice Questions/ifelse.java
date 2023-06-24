import java.util.Scanner;

class ifelse{
    public static void main(String[] args){
//tax problem
// below 5l =tax 0
// between 5l-10l = tax 20%
// above 10l=tax 30%
int income;
Scanner scan=new Scanner(System.in);
income=scan.nextInt();
int tax;
if(income<500000){
    tax=0;
}
else if(income>=500000 && income<1000000){
tax=(int)(income*0.2);//tyecasting used because income is int and tax percent is in float(0.2)
}
else{
    tax=(int)(income*0.3);
}
System.out.println("Your tax is: "+tax);
scan.close();

    }
}
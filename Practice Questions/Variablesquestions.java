import java.util.Scanner;
import java.lang.Math;
public class Variablesquestions {
    public static void main(String[] args) {
        
        //Q1) Input 3 numbers:a,b,c.Find average of these numbers

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Enter the 3 numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        double average =(double) (a+b+c)/3;
        System.out.println("Average of 3 numbers: "+average);

        //Q2) enter 3 items-a pencil,pen and eraser.you have to output the total cost of 
        //items back to the user as their bill

        float pencil = scan.nextFloat();
        pencil = pencil*5;
        System.out.println("Each pencil price is 5: "+pencil);
        float pen = scan.nextFloat();
        pen = pen*10;
        System.out.println("Each pen price is 10: "+pen);
        float eraser = scan.nextFloat();
        eraser = eraser*5;
        System.out.println("Each eraser price is 5: "+eraser);
        System.out.println("Total items(GST is applied 18%):\n"+pencil+"\n"+pen+"\n"+eraser+"\n");
        float cost = (pencil+pen+eraser);
        float gst = cost + (0.18f * cost)
        System.out.println("Total cost: "+gst);

        //Q3) what will be the type of result in following code?

        byte b = 4;
        char c='a';
        short s =512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

        double result = (f*b)+(i%c)-(d*s);
        System.out.println(result);
        scan.close();

        float $ = 7;
        System.out.println($);*/

        //Q4) find all the roots of a quadratic equation ax^2+bx+c=0

        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        System.out.println("Quadratic equation is: "+a+"x^2 + "+b+"x +"+c);
        double ab=b*b-4*a*c;
        double x1 = (-b + Math.sqrt(ab))/2*a;
        
        double x2 = (-b - Math.sqrt(ab))/2*a;
        System.out.println("Roots of given equations is: "+"("+x1+","+x2+")");

    }
}

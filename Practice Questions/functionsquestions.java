import java.util.Scanner;

public class functionsquestions {
    public static boolean iseven(int number) {
        // Scanner scan = new Scanner(System.in);
        //  number = scan.nextInt();
        if(number%2 == 0){ 
            return true;
        }
        else if(number % 2 != 0){
            return false;
        }
      return true;
    }
    public static void main(String[] args) {
        
        iseven(46);
    }
}

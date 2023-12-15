import java.util.Scanner;

public class Stringsalpha {
    // Strings are immutable....
    /*
     * public static void palindrome(String str) {
     * char count,count1;
     * 
     * for(int i=0;i<str.length();i++){
     * // System.out.print(str.charAt(i)+" ");
     * count1=str.charAt(i);
     * }
     * //System.out.println();
     * for(int j=str.length()-1;j>=0;j--){
     * //System.out.print(str.charAt(j) + " ");
     * count=str.charAt(j);
     * }if(count==count1){
     * System.out.println("this is palindrome");
     * }
     * else{
     * System.out.println("not palindrome");
     * }}
     */

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
     * public static void printletters() {
     * String printthis = "vaibhavi";
     * for(int i=0;i<printthis.length();i++){
     * System.out.print(printthis.charAt(i)+" ");
     * }
     * }
     */

     public static float getshortestpath(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            //south
            if(direction=='S'){
                y--;
            }
            //north
            else if(direction=='N'){
                y++;
            }

            //east
           else if(direction=='E') {
                x++;
            }

            //west
            else {
                x--;
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
     }
//First letter should be uppercase
//String builder:
// StringBuilder sb = new StringBuilder("arpita");
// sb.toString;//this converts any object to string eg:INTEGER(class) a = 10;
     public static String uppercase(String str) {
      StringBuilder sb = new StringBuilder("");

      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
          sb.append(str.charAt(i));
          i++;
          sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
sb.append(str.charAt(i));
        }
      }
      return sb.toString();
     }
    public static void main(String[] args) {
        /*
         * char arr[] = {'a','b','c','d'};
         * for(int i=0;i<arr.length;i++){
         * System.out.print(arr[i]+" ");
         * }
         * String str = "abcd";
         * String str2 = new String("xyz");
         * 
         * Scanner scan = new Scanner(System.in);
         * String name = scan.nextLine();
         * System.out.println(name);
         * 
         * //******Length
         * String fullname = "Arpita Sawant";
         * System.out.println(fullname.length());
         * 
         * //*******concatenation
         * String a = "arpita";
         * String b = "sawant";
         * System.out.println(a+" " +b);
         * System.out.println(a.charAt(0));
         
        String str = "bob";
        System.out.println(palindrome(str));

        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path)); 

        String s1 = "arpita";
        String s2 = "arpita";
        String s3 = new String("arpita");*/
      /*if(s1 == s2){
        System.out.println("strings are equal");
      }
      else{
        System.out.println("strings are not equal");
      }

      if(s1 == s3){
        System.out.println("strings are equal");
      }
      else{
        System.out.println("strings are not equal");
      }

      if(s1.equals(s3)){
        System.out.println("strings are equal");
      }
      else{
        System.out.println("strings are not equal");
      }

      //compareto
      //0 equal,<0 -ve str1 < str2,>0 str1>str2
      
      String fruits[] = {"mango","apple","banana"};
      String largest = fruits[0];
      for(int i=0;i<fruits.length;i++){
        if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
      }
      System.out.println(largest);*/
      String str="hi,i am arpita";
      System.out.println(uppercase(str)); 
    }
}

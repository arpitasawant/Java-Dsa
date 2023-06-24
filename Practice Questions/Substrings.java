public class Substrings {
    public static String substringprint(String str,int startindex,int endindex) {
        String substr = "";
        for(int i=startindex;i<endindex;i++){
substr += str.charAt(i);
        }
        return substr;
    }

   //String Compression
public static String stringcompression(String str) {
    String newstr = "";
    for(int i=0;i<str.length();i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newstr += str.charAt(i);
        if(count > 1){
            newstr += count.toString();
        }
    }
    return newstr;
}
   public static void main(String[] args) {
    /*String str = "helloworld";
    System.out.println(str.substring(0,5));//in-built function
   //System.out.println(substringprint(str, 0, 5));
   
   StringBuilder sb1 = new StringBuilder("");
   for(char ch= 'a';ch <='z';ch++){
    sb1.append(ch);
    //O(26)
    //O(26*26)
   }
   System.out.println(sb1);*/

   String str = "aaabbcccdd";System.out.println(stringcompression(str));
   
   } 
}

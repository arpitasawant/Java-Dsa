public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){
                for(int k=i;k<=j;k++){
                    
                    System.out.print(s.charAt(k)+" ");
                    
                }
                System.out.println();
            }
            
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);
    }
}

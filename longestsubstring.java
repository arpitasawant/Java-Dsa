public class longestsubstring {

    public static void lengthOfLongestSubstring(String s) {
        
        //int count = 0;
        for(int k=0;k<s.length();k++){
            
            for(int i=k;i<s.length();i++){
                for(int j=k;j<=i;j++){

                if(s.charAt(j) == s.charAt(i+1)){
                   System.out.print(s.charAt(j)+" "); 
                   break;
                }
                
            }
            System.out.println();
            
        }
    
        }
        
        //return count;
        
    }
    
    public static void main(String[] args) {
        String s = "ababc";
        // int result = 
        lengthOfLongestSubstring(s);
        // System.out.print(result);
    }
}

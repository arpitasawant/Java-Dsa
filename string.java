public class string {
    static int isSubstring(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++)
                if(s2.charAt(i+j) != s1.charAt(j))
                break;
                if(j==m)
                return i;
            }
            return -1;
    
            }
    
   public static void main(String[] args){
   String s1="for";
   String s2="geeksforgeeks";
   int res = isSubstring(s1, s2);
   if(res == -1)
   System.out.println("not present");
   else
   System.out.println("present at index" + res);
    }
   }



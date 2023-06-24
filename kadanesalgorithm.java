public class kadanesalgorithm {
    public static void kadanes(int numbers[]) {
        // int ts = 0;
        int maxsum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < numbers.length; i++) {
          int start = i; 
         
          for (int j = i; j < numbers.length; j++) {
            int end = j;

            curr = 0;
            for (int k = start; k <= end; k++) {
                if(curr<0)
               curr = 0;
              curr += numbers[k];
    
            }
            System.out.println(curr);
            if (maxsum < curr) {
              maxsum = curr;
            }
    
          }
    
        }
        System.out.println("max is: " + maxsum);
      }
    public static void kadanesalgo(int numbers[]) {
      //we use this algorithm because here only one loop is required and time complexity is less O(n)
      int cs=0;
      int ms=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        cs+=numbers[i];
        if(cs<0){
           cs=0;
        }
       ms=Math.max(cs, ms);
       
      }
      System.out.println("the max subarray is: "+ms);
    }
      public static void main(String[] args) {
        int numbers[] = { -2, -3,4,-1, -2, 1,5, -3 };
        kadanes(numbers);
        kadanesalgo(numbers);

      }
    }
    


public class binarysearch {
    /*
     arrays
     prerequisite - sorted arrays
     time complexity: o(logn)
     */
    public static int binarysearchno(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key)// right
            {
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }

    }

    // pairs in array
    public static void pairsarrray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: " + tp);
    }

    // print subarrays
    public static void subarrays(int numbers[]) {
        int ts = 0;
      int max=Integer.MIN_VALUE;;
      int sum;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;   sum =0;  //max=0;
            for (int j = i; j < numbers.length; j++) {
                int end = j; 
                
                // int total=(start+end);
                for (int k = start; k <= end; k++) {

                    System.out.print(numbers[k] + " ");
                    // System.out.println(start+end);
                    // for(int m=start;m<=end;m++){
                    // System.out.print(total);
                    // }
                    // System.out.print(numbers[k]+"="+total);
                   
                    ts++;
                   
                } 
                     sum=sum+numbers[j];
                   
                    System.out.print("= "+sum);
                 //sum=0;
                
               System.out.println();
              
                // if(sum>numbers[i]){
                //     sum=numbers[i];
                //     System.out.println("maximum subarray is: "+sum);
                // }
               
                
            } max=max+sum;
                if(max<=numbers[i])
                max=numbers[i];
                 System.out.println("the max: "+max);  //max++;
                
            System.out.println();
        } 
        System.out.println("total subarrays: " + ts);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 5, 6,7};
        int key = 6;
        System.out.println("index for key is: " + binarysearchno(numbers, key));
        /*
         * reverse an array
         * for(int i=0;i<numbers.length;i++){
         * System.out.print(numbers[i]+" ");
         * }
         * for(int i=6;i<=numbers.length-1;i--){
         * System.out.print(numbers[i]+" ");
         * }
         * 
         * reverse(numbers);
         * for(int i=0;i<numbers.length;i++){
         * System.out.print(numbers[i]+" ");
         * }
         */
        pairsarrray(numbers);
        // for(int i=0;i<numbers.length;i++){
        // for(int j=0;j<numbers.length;j++){
        // System.out.print(numbers[j]+" ");
        // }

        // }
        subarrays(numbers);
    }
}

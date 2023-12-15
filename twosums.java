public class twosums{
    public static void twosumproblem(int[] arr, int target) {

        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 sum = arr[i]+arr[j];
            if(sum == target){
                System.out.println("["+i+" "+j+"]");
            }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,3};
        twosumproblem(arr,6);
    }

    
}
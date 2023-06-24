import java.util.Arrays;
import java.util.Collections;
public class sorting {
    // ******Bubble sort********* O(n^2)
    // public static void bubblesort(int sort[]) {

    // int count = 0;

    // for (int turn = 0; turn < sort.length - 1; turn++) {
    // int swaps = 0;
    // for (int j = 0; j < sort.length - 1 - turn; j++) {
    // if (sort[j] > sort[j + 1]) {
    // // swap
    // int temp = sort[j];
    // sort[j] = sort[j + 1];
    // sort[j + 1] = temp;
    // count++;
    // }

    // }
    // if (swaps == count) {

    // System.out.println("array is already sorted");
    // break;
    // }

    // }
    // optimize solution for bubble sort =O(n)
    // for (int i = 0; i < sort.length - 1; i++) {
    // int swaps = 0;
    // if (sort[i] > sort[i + 1]) {
    // // swap
    // int temp = sort[i];
    // sort[i] = sort[i + 1];
    // sort[i + 1] = temp;
    // count++;
    // }

    // if (swaps == count) {

    // System.out.println("array is already sorted");
    // break;
    // }
    // }

    // }

    // swaps++;

    /*
     * Selection sort O(n^2)
     * public static void selectionsort(int sort[]) {
     * 
     * for(int i=0;i<sort.length-1;i++){
     * int minposition = i;//consider 1st as minimum element
     * for(int j=i+1;j<sort.length;j++)//i+1=unsorted arr->start
     * {
     * if(sort[minposition]>sort[j]){//ascending order (<)descending
     * minposition=j;
     * }
     * }
     * //swap
     * int temp =sort[minposition];
     * sort[minposition] = sort[i];
     * sort[i] = temp;
     * 
     * }
     * 
     * }
     
    // insertion sort O(n^2)
    public static void insertionsort(int sort[]) {
        for (int i = 1; i < sort.length; i++) {
            int curr = sort[i];
            int prev = i - 1;
            // finding out correct position
            while (prev >= 0 && sort[prev] > curr) {
                sort[prev + 1] = sort[prev];
                prev--;
            } // insertion
            sort[prev + 1] = curr;
        }
    }*/

    //counting sort
    public static void countsort() {
        
    }
    public static void printarr(Integer sort[]) {
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i] + " ");
        }
    }

    public static void main(String[] args) {
        /*Integer sort[] = { 5, 4, 1, 3, 2 };
         bubblesort(sort);
        selectionsort(sort);
        insertionsort(sort);

      // Arrays.sort(sort);inbuilt sort(O(nlogn))
      //Arrays.sort(sort,0,3);//sorting will be for 0 to 3 index

      Arrays.sort(sort,Collections.reverseOrder());//descending order*/
        printarr(sort);
    }
}

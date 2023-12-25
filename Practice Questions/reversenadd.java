/*Add Two Numbers
Medium
29.3K
5.7K
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

import java.util.Arrays;

public class reversenadd {
    
    public static void reversenaddnumber(int[] arr, int[] num) {

         int result =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<num.length;j++){
                 result = arr[i]+num[j];
                 
            }System.out.println(result);
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3};
        int num[] = {5,6,4};
        reversenaddnumber(arr,num);
    }

    
}

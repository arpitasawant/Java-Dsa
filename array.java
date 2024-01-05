import java.util.Scanner;
import java.util.*;
public class array {
    // public static void update(int marks[]) {
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }

//Program for linear search using array
    
// public static int linearsearch(int numbers[],int key) {
//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i] == key){
//             return i;
//         }

//     }return -1;
// }

// public static String menucard(String menu[],String key) {
//     //key ="dosa";
//     for(int i=0;i<menu.length;i++){
//         if(menu[i] == key)
//    System.out.println("key is present in:"+i);
//     }
    
 
//    return null;
// }

    //Program to get largest no.
public static int getlargestno(int numbers[]) {
    int largest=Integer.MIN_VALUE;//-infinite
    int smallest=Integer.MAX_VALUE;//+infinite
    for(int i=0;i<numbers.length;i++){
if(largest<numbers[i]){
largest=numbers[i];
  
    }
    if(smallest>numbers[i]){
        smallest=numbers[i];
          
            }
    
} 
System.out.println("smallest value:"+smallest);
return largest;
}
    public static void main(String[] args) {
        // datatype arrayname [] = new datatype[size];(here new keyword is use which
        // search for empty space)
        /*
         * creating an array
         * int marks[] = new int[50];
         * int numbers[] = {1,2,3};
         * String fruits[] = {"mango","orange","banana"};
         * 
         * 
         * int phy[]={3,4,5,6,7};
         * int chem[] = new int[50];
         * int math[] = new int[50];
         * for(int i=0;i<=4;i++){
         * System.out.print(phy[i]+" ");
         * }
         * 
         * int marks[] = new int[50];
         * 
         * System.out.println("array length is:  " + marks.length);
         * 
         * Scanner scan = new Scanner(System.in);
         * marks[0]=scan.nextInt();
         * marks[1]=scan.nextInt();
         * marks[2]=scan.nextInt();
         * System.out.println("phy:"+marks[0]);
         * System.out.println("chem: "+marks[1]);
         * System.out.println("maths: "+marks[2]);
         * //updation
         * // marks[2] = 100;
         * // System.out.println("maths: "+marks[2]);
         * int percentage =(marks[0]+marks[1]+marks[2])/3;
         * System.out.println("average of marks: "+percentage+"%");
         * 
         * 
         * passing arrays as argument
         * 1.pass by value(variable is changed in fun but not reflected in main fun)
         * 2.pass by reference(by calling fun array use reference)
         * int marks[] = {99,98,97};
         * update(marks);
         * for(int i=0;i<marks.length;i++){
         * System.out.print(marks[i]+" ");
         * }
         * System.out.println();
         */
 
  int numbers[] = {2,4,5,7,56,54,38,36,20,32};

  
  System.out.println("the largest no. is: "+(getlargestno(numbers)));
//  int key=90;
//  int index=linearsearch(numbers, key);
//  if(index == -1){
//  System.out.println("not found");
//     }
//     else{
//     System.out.println("the key at index: "+index);
// }
// String key = "kebb";
// String menu[] = {"dosa","kebab","biryani","chole"};
// String index=menucard(menu,key);
// if(index==""){
//     System.out.println("not found");
// }
// else{
//     System.out.println("found");
// }


}
}

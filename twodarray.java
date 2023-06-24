//import java.util.Scanner;

public class twodarray {
//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("found key at cell:(" + i + "," + j + ")");
//                     return true;
//                 }

//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }

//     public static void spiralmatrix(int matrix[][]) {
//         int startrow=0;
//         int startcol = 0;
//         int endrow=matrix.length-1;
//         int endcol = matrix[0].length-1;
// while(startrow <= endrow && startcol <= endcol){
//     //top
//     for(int j=startcol;j<=endcol;j++){
//         System.out.print(matrix[startrow][j]+" ");
//     }
//     //right
//     for(int i=startrow+1;i<=endrow;i++){
//         System.out.print(matrix[i][endcol]+" ");
//     }

//     //bottom
//     for(int j=endcol-1;j>=startcol;j--){
//         if(startrow==endrow){
//             break;
//         }
//         System.out.print(matrix[endrow][j]+" ");
//     }

//     //left
//     for(int i=endrow-1;i>=startrow+1;i--){
//         if(startrow==endrow){
//             break;
//         }
//         System.out.print(matrix[i][startcol]+" ");
//     }
//     startcol++;
//     startrow++;
//     endcol--;
//     endrow--;
// }
// System.out.println();
//     }

    // public static void diagonalsum(int matrix[][]) {
    //     int sum = 0;
        // O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){//primary diagonal
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }//return sum;
        // System.out.println(sum);

        /*for(int i=0;i<matrix.length;i++){
//primary
             sum += matrix[i][i];
                    
                    //secondary
                     if(i != matrix.length-1-i){
                        sum+=matrix[i][matrix.length-i-1];
                    }
                }
            
            System.out.println(sum);
    }*/

    public static boolean searchinsortedmatrix(int matrix[][],int key) {
        //search for a key in row wise and col wise sorted matrix(staircase search)
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("key found at: ("+i+","+j+")");
                   
                }
                else if(key!=matrix[i][j]){
                    System.out.println("not found");
                }
            }
        }*/
int row=0, col=matrix[0].length-1;
while(row < matrix.length && col>=0){
    if(matrix[row][col]==key){
        System.out.println("key found at: ("+row+","+col+")");
        return true;
    }
    else if(key < matrix[row][col]){
col--;
    }
    else{
        row++;
    }
}
System.out.println("key not found");
return false;
    }
    public static void main(String[] args) {
        /*
         * matrices
         * cells = row x col;
         * 
         * int matrix[][] = new int[3][3];
         * int n = matrix.length, m = matrix[0].length;
         * 
         * Scanner sc = new Scanner(System.in);
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < m; j++) {
         * matrix[i][j] = sc.nextInt();
         * }
         * }
         * // output
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < m; j++) {
         * System.out.print(matrix[i][j] + " ");
         * }
         * System.out.println();
         * }
         * search(matrix, 88);
         * sc.close();
         
        int matrix[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};*/
        //spiralmatrix(matrix);
        //diagonalsum(matrix);
        int matrix[][] = {{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},{32,33,39,50}
        };
        int key=133;
        searchinsortedmatrix(matrix, key);
    }
}

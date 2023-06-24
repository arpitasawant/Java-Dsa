public class advancedpattern {

    public static void main(String[] args) {
        /*
         * hollow rectangle
         * int row=7,col=8;
         * for(int i=1;i<=row;i++){
         * for(int j=1;j<=col;j++){
         * if(i==1||i==row||j==1||j==col){
         * System.out.print("*");
         * }
         * else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println(" ");
         * }
         */


        // inverted triangle
        // for(int i=1;i<=5;i++){
        // for(int j=5;j>=i;j--){
        // System.out.print(" ");
        // }
        // for(int k=1;k<=i;k++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        //inverted half-pyramid with numbers
        // for(int i=1;i<=6;i++){
        //     for(int j=1;j<=6-i;j++){
        //         //i++;
        //         System.out.print(j);
                
        //     }
        //     System.out.println(" ");
        // }

        /*floyds triangle
        int counter=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter=counter+1;
            }
            System.out.println(" ");
        }

        //0-1 triangle
       
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
           if((i+j)%2==0) {
            System.out.print("1");
           }   
           else{
            System.out.print("0");
           }
            }System.out.println(" ");
        }

        butterfly pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
             
            for(int k=10;k>=2*i;k--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
          System.out.println(" ");
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            } 
             
            for(int k=2;k<=2*i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
          System.out.println(" ");
        }*/

        //solid rhombus
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

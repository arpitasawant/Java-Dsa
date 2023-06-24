public class scope {
    /*
     * Scope
     * Method scope - if we define a variable in method we can use it anywhere in
     * the method after initialization of variable
     * before variable initialization if we call variable it will throw an error as
     * - variable
     * cannot be resolved to a variable
     * 
     * Block Scope
     * by using cruly braces the variable can be used in the block of code only
     */

    public static void main(String[] args) {
        // System.out.println(s); --error
        int s = 17;
        System.out.println(s);

        /*  block scope
        {
            int a = 10;
            System.out.println(a);
        }
        System.out.println(a);*/
    }
}

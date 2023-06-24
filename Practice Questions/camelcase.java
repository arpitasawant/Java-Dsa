public class camelcase {
   
    // function to convert the string into upper camel case  
    static String convertString( String s )  
    {  
        // to keep track of spaces  
        int ctr = 0 ;  
        // variable to hold the length of the string  
        int n = s.length( ) ;  
        // converting the string expression to character array  
        char ch[ ] = s.toCharArray( ) ;  
       // // keep track of indices of ch[ ] array  
        int c = 0 ;  
        // traversing through each character of the array  
        for ( int i = 0; i < n; i++ )  
        {  
            // The first position of the array i.e., the first letter must be  
            // converted to the upper case. We checked this before the second  
            // if statement as that statement is executed only when it encounters space and,  
            // there is no space before the first letter of a string.  
            if( i == 0 )  
            // converting to upper case using the toUpperCase( ) in-built function  
            ch[ i ] = Character.toUpperCase( ch[ i ] ) ;  
            // as we need to remove all the spaces in between, we check for empty  
            // spaces  
            if ( ch[ i ] == ' ' )  
            {  
                // incrementing the space counter by 1  
                ctr++ ;  
                // converting the letter immediately after the space to upper case  
                ch[ i + 1 ] = Character.toUpperCase( ch[ i + 1] ) ;  
                // continue the loop   
                continue ;  
            }  
            // if the space is not encountered simply copy the character  
            else  
                ch[ c++ ] = ch[ i ] ;  
        }  
        // new string will be reduced as the spaces have been removed  
        // Thus returning the new string with new size  
        return String.valueOf( ch, 0, n - ctr ) ;  
    }  
    // Driver code  
    public static void main( String args[ ] )  
    {  
        // passing the name of a method  
        String str = "class test" ;  
        System.out.println( convertString( str ) ) ;  
        // passing the name of a variable  
        String str1 = "employee" ;  
        System.out.println( convertString( str1 ) ) ;   
        // passing the String  
        String str2 = "this is the java tutorial" ;  
        System.out.println(convertString( str2 ) ) ;  
    }  
}  


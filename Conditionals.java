public class Conditionals {
    public static void main( String args[] ){
        // Arithmetic operators  + - * / % ()
        // Relational operators  > >= < <= == != ! && || 
        int x = 11;
        
        if ( x == 10 ){
            System.out.println( "X is exactly a 10!" );
        }

        if( x > 20 ){
            System.out.println( "X is greater than 20!" );
        }
        else{
            System.out.println( "X is lesser than 20!" );
        }
        /*
        switch( x ){
            case 10 : System.out.println( "X is exactly a 10!" );
                        break;
            case 20 : System.out.println( "X is exactly a 20!" );
                        break;
            case 30 : System.out.println( "X is exactly a 30!" );
                        break;
            default:  System.out.println( "Invalid number in X" );
        }
        */
    }
}

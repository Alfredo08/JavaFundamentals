
public class Introduction{
    public static void main( String args[] ){
        System.out.println( "Hey there!" ); // print( "Hey there!" )
        
        final int age; // Whole numbers  
        age = 20;

        double pi = 3.1416; // Real numbers
        float pi2 = 3.14f;
        boolean flag = false; // flag = True
        char letter = 'A';
        String sentence = "Hey there!";
        String word = new String( "programming" );
        
        System.out.println( "Length: " + sentence.length() ); // len( sentence )
        System.out.println( sentence.toUpperCase() );
        System.out.println( sentence.toLowerCase() );
        System.out.println( sentence );
        System.out.println( sentence.trim() );
        //System.out.format( "Length: %d Sentence: %s", sentence.length(), sentence);
        System.out.println( "Index of e: " + sentence.indexOf( "there" ) );
        System.out.println( word );
        word = "developing";
        System.out.println( word );
        word += " and programming";
        System.out.println( word );
        System.out.println( "age: " + age  );
    }
}

/*
class Introduction{
    def main( args ):
}
*/

// Inline comment

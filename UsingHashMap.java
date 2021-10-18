import java.util.HashMap;

public class UsingHashMap {
    public static void main( String args[] ){
        HashMap<Integer, String> namesHash = new HashMap<Integer, String>();

        namesHash.put( 123, "Alex" );
        namesHash.put( 456, "Roger" );
        namesHash.put( 789, "Alan" );
        namesHash.put( 456, "Alfredo" );
        String name = namesHash.get( 456 );
        System.out.println( name );
        //String valueRemoved = namesHash.remove( 456 );
        //name = namesHash.get( 456 );
        //System.out.println( name + " previous value = " + valueRemoved );

        System.out.println( "--------" );
        for( Integer key : namesHash.keySet() ){
            System.out.println( key );
            name = namesHash.get( key );
            System.out.println( name );
        }
    } 
}


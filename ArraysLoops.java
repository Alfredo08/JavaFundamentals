import java.util.ArrayList;
public class ArraysLoops {
    public static void main( String args[] ){
        double numbers[] = new double[10]; // malloc = memory allocation
        int ages[] = {20, 25, 30, 35, 40};
        String names[]; // Declaring the array
        int numNames = 15;
        names = new String[numNames]; // Initializing the array

        names[0] = "Alex";
        names[1] = "Roger";

        // javascript for( let i = 0; i < ages.length; i ++ ){}
        for( int i = 0; i < ages.length; i ++ ){
            System.out.println( ages[i] );
        }

        int j = 0;
        while( j < ages.length ){
            System.out.println( ages[j] );
            j ++;
        }

        /*
        int z = 20;
        do{

            z ++;
        }
        while(z < 20); */

        ArrayList<String> list = new ArrayList<String>();
        // add, clear, clone, contains, get, indexOf, isEmpty, remove, size
        list.add( "Alex" );
        list.add( "Roger" );
        System.out.println( list.size() );

        for( int i = 0; i < list.size(); i ++ ){
            System.out.println( list.get(i) );
        }

    }
}

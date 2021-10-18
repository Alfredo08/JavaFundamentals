public class HandlingErrors {
    public static void main( String args[] ){
        try{
            int nums[] = new int[10];
            //System.out.println( nums[20] ); 
            throw new Exception( "Something went wrong!" ); 
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println( "That index of the array doesn't exists!" );
        }
        catch( Exception error ){
            System.out.println( error );
        }
        finally{
           System.out.println( "This will always show!" ); 
        }   
    }
}

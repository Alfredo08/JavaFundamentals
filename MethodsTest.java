
public class MethodsTest {
        public static void main( String args[] ){

        double n1 = 21.5;
        double n2 = 30.75;
        Methods test = new Methods();

        double result = test.addTwoNumbers( n1, n2 );
        System.out.println( "Result: " + result );
        test.printValue( 20.76 );
        test.printValue( 88.88 );
    }
}

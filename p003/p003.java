import java.lang.Math;
public class p003 {
   
  public static void main ( String args[] ) {
    
    long target = 0;
    
    try {
      target = Long.parseLong(args[0]);
    } catch ( NumberFormatException e ) {
      System.err.println("Could not parse parameter");
      System.exit(1);
    }
    catch ( ArrayIndexOutOfBoundsException e ) {
      System.err.println("Specify target number");
      System.exit(2);
    }

    for( long i = 2; i * i <= target; i++) {
      if ( target % i == 0 ) {
	if ( isPrime(i) ) {
	  System.out.println(i);
	}
      }
    }
  }
  
  private static boolean isPrime(long num) {
    for ( long i = 2; i <= Math.sqrt(num); i++){
      if ( num % i == 0 ) {
        return false;
      }
    }
    return true;
  }
}

import java.lang.Math;
import java.text.NumberFormat;
import java.text.DecimalFormat;
class p009 {

  public static void main (String args[]) {
    
    for ( int a = 1; a < 1000; a++) {
      for ( int b = a+1; b < 1000; b++ ) {
        int as = a*a;
	int bs = b*b;
	int cs = as + bs;
	double c = Math.sqrt(cs);
        if ( c - (int)c != 0 ) {
	  continue;
	}
	if ( a + b + c == 1000){
	  System.out.println(a + " " + b + " " + c);
	  NumberFormat formatter = new DecimalFormat("#0");
	  System.out.println(formatter.format(a*b*c));
	  System.exit(0);
	}
      }
    }

  }

}

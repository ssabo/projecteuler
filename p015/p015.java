import java.text.NumberFormat;
import java.text.DecimalFormat;
class p015 {

  public static void main (String args[]) {
    System.out.println(calc(20));
  }

  private static String calc(double max){
    double n = 2*max;
    double k = max;
    double answer = factorial(n) / ( factorial(k) * factorial(n-k) );
    NumberFormat formatter = new DecimalFormat("#0");
    return formatter.format(answer);
  }

  private static double factorial(double n){
    if(n == 0)
      return 1;
    return n * factorial(n-1);
  }
}

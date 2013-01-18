import java.lang.Math;

class p012 {
  public static void main (String args[]) {
    long count = 1;
    long trinum = 0;

    while ( true ){
      trinum += count;
      int num = getNumFactors(trinum);
      //System.out.println(trinum + " " + num);
      if(num > 500){
        System.out.println(trinum);
	System.exit(0);
      }
      count++;
    }
  }

  private static int getNumFactors(long num){
    if ( num == 1)
      return 1;
    int count = 0;
    for ( long i = 1; i <= Math.sqrt(num); i++){
      if(num % i == 0){
        count++;
      }
    }
    return count*2;
  }
}

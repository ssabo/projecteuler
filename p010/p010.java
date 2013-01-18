class p010 {
  public static void main (String args[]) {
    long max = 2000000;
    //long max = 10;
    
    long sum = 0;

    for ( long i = 2; i < max; i++) {
      if(isPrime(i)){
        sum+=i;
      }
    }
    System.out.println(sum);
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

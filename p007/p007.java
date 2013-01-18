class p007 {
  public static void main (String args[]) {
    int count = 0;
    int num = 2;
    while(true) {

      if(isPrime(num)){
       count++;
      }

      if( count == 10001){
        break;
      }
      num++;
    }
    System.out.println(num);
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

class p005 {
   
  private static int max = 20;

  public static void main (String args[]) {
    
    int num = 1;
    
    while(true) {
      if ( matches(num) ) {
        System.out.println(num);
	break;
      }
      num++;
    }
  }

  private static boolean matches (int n) {
    for (int i = 1; i < max; i++ ) {
      if ( n % i != 0 ) {
        return false;
      }
    }
    return true;
  }
}

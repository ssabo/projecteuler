class p004 {
  
  public static void main ( String args[] ) {
    int min = 100;
    int max = 999;
    int largest = 0;
    for ( int i = min; i <= max; i++) {
      for ( int j = min; j <= max; j++ ) {
        int prod = i * j;
	  if ( isPalindrome(prod) ) {
	    if ( prod > largest ){
	      largest = prod;
	    }
	  }
      }
    }
    System.out.println(largest);
  }

  private static boolean isPalindrome(int n) {
    String num = Integer.toString(n);
    char[] reverseNum = new char[num.length()];
    
    for ( int i = num.length()-1, j = 0; i != -1 ; i--, j++) {
      reverseNum[j] = num.charAt(i);
    }
    
    String revNum = new String(reverseNum);
    
    if ( num.equals(revNum) ){
      return true;
    }
    return false;
  }
}

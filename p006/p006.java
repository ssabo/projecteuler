class p006 {
  
  public static void main (String args[]){
    int max = 100;

    int sumOfSquares = 0;

    for (int i = 1; i <= max; i++) {
      sumOfSquares += i * i;
    }

    int sum = 0;

    for (int i = 0; i <= max; i++) {
      sum += i;
    }
    int squareOfSums = sum * sum;
    System.out.println(squareOfSums - sumOfSquares);
  }
}

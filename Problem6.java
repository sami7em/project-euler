public class Problem6 {
  public static void main(String[] args) {
    int n = 100;
    int sumOfSquares = 0;
    int squareOfSum = 0;
    int difference;
    
    for(int i = 1; i < n+1; i++) {
      sumOfSquares += (i*i);
      squareOfSum += i;
    }
    squareOfSum *= squareOfSum;
    difference = squareOfSum - sumOfSquares;
    System.out.println("Sum of squares = " + sumOfSquares);
    System.out.println("Square of sum = " + squareOfSum);
    System.out.println("Difference = " + difference);
  }
}

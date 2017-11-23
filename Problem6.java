// Problem 6 - 	Sum square difference
// The sum of the squares of the first ten natural numbers is,
// 12 + 22 + ... + 102 = 385
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

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

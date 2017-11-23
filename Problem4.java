// Problem 4
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
  public static void main(String[] args) {
    int largest = 0;
    for(int i = 100; i < 1000; i++) {
      for(int j = 100; j < 1000; j++) {
        if(isPalindrome(i*j)) {
          if(i*j > largest) {
            largest = i*j;
          }
          System.out.println(i + " x " + j + " = " + i*j + " LARGEST = " + largest);
        }
      }
    }
  }
  
  public static boolean isPalindrome(int n1) {
    int copy = n1;
    int n2 = 0;
    
    while(copy > 0) {
      n2 *= 10;
      n2 = n2 + (copy % 10);
      copy /= 10;
    }
    if(n1 == n2) {
      return true;
    } else {
      return false;
    }
  }
}

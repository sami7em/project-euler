// Problem 9 - Special Pythagorean triplet
// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class Problem9 {
  public static void main(String[] args) {
    int sum;
    int product;
    int n = 1000;
    int k;
    for(int i = 0; i < n; i++) {
      for(int j = i+1; j < n; j++) {
        k = n - i - j;
        if(isPythagorean(i, j, k)) {
          sum = i + j + k;
          product = i * j * k;
          if(j < k) {
            System.out.println(i + "^2" + " + " + j + "^2" + " = " + k + "^2" + " Sum = " + sum + " Product = " + product);
          }
        }
      }
    }
  }
  
  public static boolean isPythagorean(double a, double b, double c) {
    double result = Math.pow(a, 2) + Math.pow(b, 2);
    if(Math.pow(c, 2) == result) {
      return true;
    } else {
      return false;
    }
  }
}

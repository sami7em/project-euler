// Problem 7 - 10001st prime
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class Main {
  public static void main(String[] args) {
    int count = 0;
    int i = 0;
    while(count != 10001) {
      i++;
      if(isPrime(i)) {
        count++;
      }
    }
    System.out.print(i);
}

  public static boolean isPrime(int n) {
    if(n < 2) {
      return false;
    } else if (n == 2) {
      return true;
    } else {
      for(int i = 2; i < n; i++) {
        if(n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}

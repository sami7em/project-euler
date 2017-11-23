// Problem 3
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

// Took about 1 min 45 seconds to complete running
public class Problem3 {
  public static void main(String args[]) {
    long n = 600_851_475_143L;
    int largestPrimeFactor = 0;

    for(long i = 1; i < 10_000_000_000L; i++) {
      if((n % i == 0) && isPrime(i)) {
          System.out.println("Prime Factor = " + i);
          largestPrimeFactor = (int)i;
      }
    }
    // Since there are no prime factors between the LPF we calculated and 10 billion, 
    // I'm assuming there aren't any between 10 billion and 600 billion.
    // The LPF is just 0.000001% of 600851475143 (I personally found that fascinating)
    System.out.println("\nLargest Prime Factor: " + largestPrimeFactor);
  }
  
  public static boolean isPrime(long n) {
    if(n < 2) {
      return false;
    }
    if(n == 2) {
      return true;
    }
    for(int i = 2; i < n; i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

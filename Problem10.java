// Problem 10 - Summation of primes
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

public class Problem10 {
    // took 11 minutes and 10 seconds to complete execution
    public static void main(String args[]) {
        long sum = 0L;
        int n = 2_000_000;
        for(int i = 0; i < n; i++) {
            if(isPrime(i)) {
                sum += i;
                System.out.println("i = " + i + " Sum = " + sum);
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
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

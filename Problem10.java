// Problem 10 - Summation of primes
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

public class Problem10 {
    // execution completed within a second using the sieve of Eratosthenes algorithm
    public static void main(String args[]) {
        int n = 2_000_000;
        int prime = 1;
        long sum = 0L;
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = i;
        }
        int i;
        while (prime < n - 1) {
            i = 2;
            prime++;
            if (list[prime] == -1) {
                continue;
            }
            while (i * prime < n) {
                list[i * prime] = -1;
                i++;
            }
        }
        for (int j = 2; j < n - 2; j++) {
            if (list[j] != -1) {
                sum += j;
            }
        }
        System.out.println("Sum = " + sum);
    }
}

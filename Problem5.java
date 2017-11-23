// Problem 5
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
  public static void main(String[] args) {
    int num = 1;
    for(int i = 0; i < 20; i++) {
      if(num % (i+1) == 0) {
        continue;
      }
      else {
        num++;
        i = 0;
      }
    }
    System.out.println(num);
  }
}

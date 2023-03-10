// Write a Java program and compute the sum of the digits of an integer.


import java.util.Scanner;

public class Q_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer: ");
    long n = input.nextLong();
    System.out.println("The sum of the digits is: " + sumDigits(n));

  }

  public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
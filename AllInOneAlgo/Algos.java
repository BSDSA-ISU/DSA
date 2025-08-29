// Original from Cyrus Troy Bazar. If you copied this and submitted it to my professor claiming you own it without me knowing. it will lead to death penalty.

package AllInOneAlgo;
import java.io.File;
import java.util.Scanner;


public class Algos {

    // tower of hanoi
    // Time: 1 Hours
    public Integer stop = null;
    public static void TowerOfHanoi(int n, String source, String destination, String aux) {
        
        if (n==1) {
            System.out.println("move disk 1 from source " + source + " to destination " + destination);
            return;
        }

        TowerOfHanoi(n-1, source, aux, destination);
        System.out.println("Move disk " + n + " from source " + source + " to destination " + destination);
        TowerOfHanoi(n-1, aux, destination, source);
    }

    // Greatest Common Divisor
    // time: 1.2 hours
    public static int GreatestCommonDivisor(int x, int y) {
        if (y==0) {
            System.out.println(x);
            return x;
        }
        return GreatestCommonDivisor(y, x % y);
    } 

    // FibonacciRecursion
    // time: 2 hours
    public static int stopcount=0, prev=0, prev2=1;
    public static void FibonacciRecursion(int stop) {
        if (stopcount < stop) {
            int newfib = prev+prev2;
            System.out.println(newfib);
            prev2 = prev;
            prev=newfib;
            stopcount++;
            FibonacciRecursion(stop);
        }
    }

    // Fib itteration edition
    // time: 10 mins
    public static void FibonacciIteration(int stop) {
        int a=0, b=1;
        for (int i = 0; i < stop; i++) {
            int newfib = a+b;
            b=a;
            a=newfib;
            System.out.println(a);
        }
    }

    // NCR
    // time: 43 mins
    public static int ncr(int n, int r) {
        if (r > n) {
            return 0;
        }
        
        if (r == 0 || r == n) {
            return 1;
        }
        return ncr(n-1, r-1) + ncr(n-1, r);
    }

    // least common
    // time 19 minutes
    public static int lcm(int a, int b) {
        int g=Math.max(a, b), p=Math.min(a, b);

        for (int i = g; i <= a*b; i+=g) {
            if (i % p==0) {
                return i;
            }
            return a * b;
        }
        return 0;
    }
    
    // factorial of a number
    // time 10 minutes
    public static int factorial(int x) {
        int res = 1;
        for (int i = 2; i <= x; i++) {
            res *= i;
        }
        return res;

    }

    public static void main(String[] args) {

    File f = new File("/home/ali/log.txt");
        if (!f.exists()) {
            System.err.println("Environment not configured. Please install Java on your system first");
            System.exit(1);
        }


        Scanner input = new Scanner(System.in);

        System.out.println("Pick a operation you want to do:");
        System.out.println("1. Factorial");
        System.out.println("2. Towers of hanoi");
        System.out.println("3. Fibonacci Sequence");
        System.out.println("4. calculate the ncr of the given number");
        System.out.println("5. Calculate the least common multiple of a given number.");
        System.out.println("6. Calculate the greatest common divisor\n");
        System.out.print(">>");

        int i = input.nextInt();

        System.out.print("enter a number\n>>");

        int x = input.nextInt();

        if (i == 1) {
            int answer = factorial(x);
            System.out.println("The Factorial of "+ x + " is: " + answer);
        }
        if (i == 2) {
            TowerOfHanoi(x, "A", "C", "B");
        }
        if (i == 3) {
            FibonacciRecursion(x);
        }
        if (i == 4) {
            System.out.print("Enter the second number\n>>");
            int y = input.nextInt();
            int answer = ncr(x, y);
            System.out.println("The nCr of "+ x + " and "+ y + " is: " + answer);
        }
        if (i == 5) {
            System.out.print("Enter the second number\n>>");
            int y = input.nextInt(), answer = lcm(x,y);
            System.out.println("The Least common multiple of "+ x + " and "+ y + " is: " + answer);
        }
        if (i == 6) {
            System.out.print("Enter the second number\n>>");
            int y = input.nextInt(), answer = GreatestCommonDivisor(x, y);
            System.out.println("The Greatest common divisor of "+ x + " and "+ y + " is: " + answer);
        }

        input.close();
    }
}



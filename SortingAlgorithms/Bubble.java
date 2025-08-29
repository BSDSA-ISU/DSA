package SortingAlgorithms;

import java.util.Arrays;

public class Bubble {
    public static double[] Sort(double [] x) {
        double i, t;
        int ArrayLength = x.length, j;
        boolean swp;
        for (i = 0; i < ArrayLength - 1; i++) {
            swp = false;

            for (j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j+1]) {
                    t=x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = t;
                    swp=true;
                }    
            }

            if (swp != true ) {
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        double[] a = {1, 5, 2 ,4, 8, 8, 9, 9, 0.1}; 
        System.out.println("unsorted array:" + Arrays.toString(a)); System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(Sort(a)));
    }
}

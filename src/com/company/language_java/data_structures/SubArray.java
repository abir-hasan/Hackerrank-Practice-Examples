package com.company.language_java.data_structures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Abir Hasan on 27-Dec-19
 * <p>
 * Practice > Java > Data Structures > Java Subarray
 *
 * @see: <a href="Link">https://www.hackerrank.com/challenges/java-negative-subarray/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen</a>
 * <p>
 * Sample Input
 * <p>
 * 5
 * 1 -2 4 -5 1
 * <p>
 * Sample Output
 * <p>
 * 9
 */
public class SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int counter = 0;

        // Number of consecutive sub-array would be exactly same as the
        // length of the array
        // Like in first step there will be one array of n digits
        // In second step there will be two array of n-1 digits
        // In third step there will be three array of n-2 digits, so on and so forth...
        // For example say, there are 5 digits in an array
        // In first step there will be 1 array of 5 digits
        // In second step there will be 2 array of 4 digits
        // In third step there will be 3 array of 3 digits
        // In fourth step there will be 4 array of 2 digits
        // In fifth step there will be 5 array of 1 digits
        for (int i = 1; i <= n; i++) {
            int noOfDigitsInSubArray = n - i + 1;
            for (int j = 0; j < i; j++) {
                // i denotes exactly how many sub-arrays possible
                // then creating consecutive sub-arrays
                int[] temp = Arrays.copyOfRange(a, j, noOfDigitsInSubArray + j);
                int value = 0;
                // After that calculating the value of the sub-array
                for (int item : temp) {
                    value = value + item;
                }

                if (value < 0) // Increase counter when the value of sub-array is negative
                    counter++;
            }
        }
        System.out.println(counter);
    }
}

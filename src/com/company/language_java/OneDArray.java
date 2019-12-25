package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 25-Dec-19
 *
 * Practice > Java > Data Structures > Java 1D Array
 */
public class OneDArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

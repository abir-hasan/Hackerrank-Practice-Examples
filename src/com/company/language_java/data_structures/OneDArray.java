package com.company.language_java.data_structures;

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
        for (int value : a) {
            System.out.println(value);
        }
    }
}

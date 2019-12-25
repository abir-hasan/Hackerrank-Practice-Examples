package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 25-Dec-19
 * <p>
 * Practice > Java > Data Structures > Java 2D Array
 * [Hourglass problem]
 *
 * @see: https://www.hackerrank.com/challenges/java-2d-array/problem?h_r=next-challenge&h_v=zen
 * <p>
 * Sample Input
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * <p>
 * Sample Output
 * <p>
 * 19
 */

public class TwoDArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int a1, a2, a3, a4, a5, a6, a7, a8, a9, temp = 0;
        int max = -100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a1 = arr[i][j];
                a2 = arr[i][j + 1];
                a3 = arr[i][j + 2];

                //a4 = arr[i + 1][j];
                a5 = arr[i + 1][j + 1];
                //a6 = arr[i + 1][j + 2];

                a7 = arr[i + 2][j];
                a8 = arr[i + 2][j + 1];
                a9 = arr[i + 2][j + 2];

                //temp = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9;
                temp = a1 + a2 + a3  + a5  + a7 + a8 + a9;
                System.err.println("currTemp: " + temp + " prevMax: " + max);
                if (temp > max)
                    max = temp;

            }
        }
        System.out.println(max);
        scanner.close();
    }
}

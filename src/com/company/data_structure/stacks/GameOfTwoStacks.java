package com.company.data_structure.stacks;

import java.util.Scanner;

/**
 * Created by Abir on 05-Aug-17.
 * Problem: Data Structures> Stacks>  Game of Two Stacks
 */
public class GameOfTwoStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for (int b_i = 0; b_i < m; b_i++) {
                b[b_i] = in.nextInt();
            }

            int aMax = aMaxMove(a, b, x);
            int bMax = bMaxMove(a, b, x);
            System.out.println(aMax + " " + bMax);
            if (aMax >= bMax) {
                System.out.println(aMax);
            } else {
                System.out.println(bMax);
            }
        }
    }

    private static int bMaxMove(int[] a, int[] b, int x) {
        int val = 0;
        int aIndex = 0;
        int bIndex = 0;
        int counter = 0;


        val = val + b[bIndex];
        bIndex++;
        counter++;
        while (val <= x && (aIndex < a.length || bIndex < b.length)) {
            int tempVal = 0;
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] <= b[bIndex]) {
                    tempVal = a[aIndex];
                    aIndex++;
                } else {
                    tempVal = b[bIndex];
                    bIndex++;
                }


                val = val + tempVal;
                counter++;
            } else if (aIndex < a.length) {
                tempVal = a[aIndex];
                aIndex++;


                val = val + tempVal;
                counter++;
            } else if (bIndex < b.length) {
                tempVal = b[bIndex];
                bIndex++;


                val = val + tempVal;
                counter++;
            }
        }
        return counter - 1;
    }

    private static int aMaxMove(int[] a, int[] b, int max) {
        int val = 0;
        int aIndex = 0;
        int bIndex = 0;
        int counter = 0;

        val = val + a[aIndex];
        aIndex++;
        counter++;
        while (val <= max && (aIndex < a.length || bIndex < b.length)) {

            int tempVal = 0;
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] <= b[bIndex]) {
                    tempVal = a[aIndex];
                    aIndex++;
                } else {
                    tempVal = b[bIndex];
                    bIndex++;
                }
            } else if (aIndex < a.length) {
                tempVal = a[aIndex];
                aIndex++;
            } else if (bIndex < b.length) {
                tempVal = b[bIndex];
                bIndex++;
            }
            val = val + tempVal;
            counter++;
        }
        return counter - 1;
    }
}

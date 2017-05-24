package com.company;

import java.util.Scanner;

public class Solution {
    private static int[] list;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = 0;
        }

        // Input & Operations
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int k = scan.nextInt();
            increaseValue(x, y, k);
        }

        // Result
        int max = -100;
        for (int i = 0; i < n; i++) {
           // System.err.println(list[i]);
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.print(max);
    }

    private static void increaseValue(int x, int y, int val) {

        for (int i = x - 1; i < y; i++) {
            int temp = list[i] + val;
            list[i] = temp;
        }
    }
}

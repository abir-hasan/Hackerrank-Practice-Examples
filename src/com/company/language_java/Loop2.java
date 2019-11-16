package com.company.language_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created By Abir Hasan on 16-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Loop 2
 */
public class Loop2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getValue(a, b, n);
        }
        in.close();
    }

    private static void getValue(int a, int b, int n) {
        ArrayList values = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j <= i; j++) {
                total += Math.pow(2, j) * b;
            }
            values.add(total + a);
        }
        for (int k = 0; k < values.size(); k++) {
            System.out.print(values.get(k) + " ");
        }
        System.out.println("");
    }

    /*private static void getValue(int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            int value = a + calc(b, i);
            System.out.println(value);
        }

    }

    private static int calc(int b, int n) {
        if (n == 0) {
            return (int) (Math.pow(2, n) * b);
        } else {
            return calc(b, n )+calc(b, n-1);
        }
    }*/
}

package com.company.contests;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abir Hasan on 16-May-17.
 */
public class MonsterFight {
    static int getMaxMonsters(int n, long hit, long t, long[] h) {
        int count = 0;
        Arrays.sort(h);
        for (long i = t; i > 0; i--) {
            h[count] = h[count] - hit;
            if (h[count] <= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long hit = in.nextInt();
        long t = in.nextInt();
        long[] h = new long[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }
}

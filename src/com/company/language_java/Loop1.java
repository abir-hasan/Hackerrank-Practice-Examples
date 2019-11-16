package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 16-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Loop 1
 */
public class Loop1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int value = input * i;
            System.out.println(input + " x " + i + " = " + value);
        }
        sc.close();
    }
}

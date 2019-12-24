package com.company.language_java.string_problems;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 24-Dec-19
 * <p>
 * Practice > Java > Strings > Java String Reverse
 * <p>
 * Sample Input
 * <p>
 * madam
 * <p>
 * Sample Output
 * <p>
 * Yes
 */
public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] b = new char[a.length()];
        char[] c = a.toCharArray();

        for (int i = a.length() - 1; i >= 0; i--) {
            b[a.length() - 1 - i] = c[i];
        }

        String rev = String.valueOf(b);

        if (a.equals(rev)) { // Check if palindrome
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

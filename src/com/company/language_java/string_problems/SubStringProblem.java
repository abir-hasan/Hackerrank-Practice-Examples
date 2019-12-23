package com.company.language_java.string_problems;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Dec-19
 * <p>
 * Practice > Java > Strings > Java Substring
 * <p>
 * Sample Input
 * <p>
 * Helloworld
 * 3 7
 * <p>
 * Sample Output
 * <p>
 * lowo
 */
public class SubStringProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}

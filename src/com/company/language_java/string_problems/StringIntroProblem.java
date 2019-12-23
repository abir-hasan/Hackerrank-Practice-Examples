package com.company.language_java.string_problems;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Dec-19
 * <p>
 * Practice > Java > Strings > Java Strings Introduction
 * <p>
 * Sample Input 0
 * <p>
 * hello
 * java
 * <p>
 * <p>
 * Sample Output 0
 * <p>
 * 9
 * No
 * Hello Java
 */

public class StringIntroProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int countA = a.length();
        int countB = b.length();
        int count = countA + countB;

        char[] a1 = a.toCharArray();
        String a2 = String.valueOf(a1[0]).toUpperCase();
        String subA = a.substring(1, countA);
        String aAns = a2 + subA;

        char[] b1 = b.toCharArray();
        String b2 = String.valueOf(b1[0]).toUpperCase();
        String subB = b.substring(1, countB);
        String bAns = b2 + subB;


        System.out.println(count);
        if (a.compareTo(b) > 0) { // compare two strings lexicographically
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(aAns + " " + bAns);
    }
}

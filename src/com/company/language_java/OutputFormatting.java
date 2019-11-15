package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 15-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Output Formatting
 *
 * Sample Input:
 *
 * java 100
 * cpp 65
 * python 50
 */
public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println("");
            String newInt = "";
            if (x < 10) {
                newInt = "00" + x;
            } else if (x < 100) {
                newInt = "0" + x;
            } else {
                newInt = "" + x;
            }

            int stringSize = s1.length();
            int spaceCount = stringSize <= 9 ? 15 - stringSize : 5;
            String space = "";
            for (int j = 0; j < spaceCount; j++) {
                space += " ";
            }
            System.out.println(s1 + space + newInt);
        }
        System.out.println("================================");
    }
}

package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 15-Nov-19
 *
 * Practice > Java > Introduction > Java If-Else
 */
public class PracticeIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (value <= 5) {
                System.out.println("Not Weird");
            } else if (value <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}

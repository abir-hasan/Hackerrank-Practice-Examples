package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 15-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Stdin and Stdout II
 */
public class StdinStout2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        scanner.nextLine(); // Otherwise it only prints an empty line, this helps get to next line
        String c = scanner.nextLine();


        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);

        scanner.close();
    }
}

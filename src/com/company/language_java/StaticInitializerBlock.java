package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Static Initializer Block
 */
public class StaticInitializerBlock {

    private final static Scanner scanner = new Scanner(System.in);
    private final static int B = scanner.nextInt();
    private final static int H = scanner.nextInt();
    private static boolean flag = false;

    static {
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

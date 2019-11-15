package com.company.language_java;


import java.util.Scanner;

/**
 * Created by Abir Hasan on 15-Nov-19.
 * <p>
 * Problem: Practice > Java > Introduction > Java Stdin and Stdout I
 */
public class StdinStout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}

package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Dec-19
 *
 * Problem: Practice > Java > Strings > Valid Username Regular Expression
 *
 * @source - https://www.javatpoint.com/java-regex
 */
public class UsernameValidator {

    //private static final String regularExpression = "[a-zA-Z][a-zA-Z_0-9^S]{7,29}";
    private static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

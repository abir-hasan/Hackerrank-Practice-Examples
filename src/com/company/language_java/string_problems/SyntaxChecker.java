package com.company.language_java.string_problems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created By Abir Hasan on 24-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java Syntax Checker
 */
public class SyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern pat = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

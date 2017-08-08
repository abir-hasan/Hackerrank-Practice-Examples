package com.company.data_structure.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Abir on 07-Aug-17.
 * Problem: Data Structures> Stacks>  Simple Text Editor
 */
public class SimpleTextEditor {

    private static String mainString = "";
    private static Stack<String> tempStack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String choice, value = null;

        for (int i = 0; i < val; i++) {
            choice = sc.next();
            if (!choice.equals("4")) {
                value = sc.next();
            }
            performOperation(choice, value);
        }

    }

    private static void performOperation(String choice, String value) {
        switch (choice) {
            // Add
            case "1":
                tempStack.push(mainString);
                mainString = mainString + value;
                break;
            // Delete
            case "2":
                tempStack.push(mainString);
                mainString = mainString.substring(0, mainString.length() - Integer.parseInt(value));
                break;
            // Print
            case "3":
                System.out.println(mainString.charAt(Integer.parseInt(value) - 1));
                break;
            // Undo
            case "4":
                mainString = tempStack.pop();
                break;
        }
    }
}

package com.company.data_structure.stacks;

import java.util.Objects;
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

        String[][] input = new String[val][2];

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < 2; j++) {
                input[i][j] = sc.next();
                if (input[i][0].contains("4")) {
                    break;
                }

            }
        }


        String choice = null, value = null;
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    choice = input[i][j];
                    if (Objects.equals(choice, "4")) {
                        break;
                    }
                } else {
                    value = input[i][j];
                }
            }
            performOperation(choice, value);
        }

    }

    private static void performOperation(String choice, String value) {
        switch (choice) {
            case "1":
                tempStack.push(mainString);
                mainString = mainString + value;
                break;
            case "2":
                tempStack.push(mainString);
                mainString = mainString.substring(0, mainString.length() - Integer.parseInt(value));
                break;
            case "3":
                System.out.println(mainString.charAt(Integer.parseInt(value) - 1));
                break;
            case "4":
                mainString = tempStack.pop();
                break;
        }

    }
}

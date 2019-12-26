package com.company.language_java.data_structures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created By Abir Hasan on 26-Dec-19
 * <p>
 * Practice > Java > Data Structures > Java Arraylist
 *
 * @see <a href="Link">https://www.hackerrank.com/challenges/java-arraylist/problem</a>
 */
public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfLines = scanner.nextInt();
        ArrayList<Integer[]> numbersList = new ArrayList<>();
        for (int i = 0; i < noOfLines; i++) {
            int noOfNumbers = scanner.nextInt();
            Integer[] numbers = new Integer[noOfNumbers];
            for (int j = 0; j < noOfNumbers; j++) {
                numbers[j] = scanner.nextInt();
            }
            numbersList.add(numbers);
        }

        int noOfQueries = scanner.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            int lineNumber = scanner.nextInt();
            int numbersPosition = scanner.nextInt();
            Integer[] array = numbersList.get(lineNumber - 1);
            if (numbersPosition <= array.length) {
                System.out.println(array[numbersPosition - 1]);
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}

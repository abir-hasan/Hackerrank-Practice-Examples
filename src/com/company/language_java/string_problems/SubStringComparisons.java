package com.company.language_java.string_problems;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Dec-19
 * <p>
 * Practice > Java >Strings > Java Substring Comparisons
 * <p>
 * Sample Input 0
 * <p>
 * welcometojava
 * 3
 * <p>
 * Sample Output 0
 * <p>
 * ava
 * wel
 */
public class SubStringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int subStringCount = s.length() - (k - 1);
        String[] subStrings = new String[subStringCount];

        for (int i = 0; i < subStringCount; i++) {
            String temp = s.substring(i, i + k);
            subStrings[i] = temp;
        }
        for (String value : subStrings) {
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            if (smallest.equals("")) { // Need an initial low value otherwise empty string always be the SMALLEST
                smallest = value;
            } else if (value.compareTo(smallest) < 0) {
                smallest = value;
            }
            // 'largest' must be the lexicographically largest substring of length 'k'
            if (value.compareTo(largest) > 0) {
                largest = value;
            }
        }
        return smallest + "\n" + largest;
    }
}

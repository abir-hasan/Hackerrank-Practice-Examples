package com.company.language_java.string_problems;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 24-Dec-19
 * <p>
 * Practice > Java > Strings > Java Anagrams
 * <p>
 * Sample Input 0
 * <p>
 * anagram
 * margana
 * <p>
 * Sample Output 0
 * <p>
 * Anagrams
 */
public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        char[] first = a.toLowerCase().toCharArray();

        java.util.HashMap<Character, Integer> secondMap = new java.util.HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            Character temp = b.toLowerCase().charAt(i);
            if (!secondMap.containsKey(temp)) {
                secondMap.put(temp, 1);
            } else {
                int freq = secondMap.get(temp);
                secondMap.put(temp, freq + 1);
            }
        }

        for (char c : first) {
            if (!secondMap.containsKey(c)) {
                return false;
            } else {
                int freq = secondMap.get(c);
                if (freq == 0) {
                    return false;
                } else {
                    secondMap.put(c, freq - 1);
                }
            }
        }
        return true;
    }
}

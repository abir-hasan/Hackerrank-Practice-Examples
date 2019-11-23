package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 23-Nov-19
 * <p>
 * Problem: Practice > Java > Introduction > Java End-of-file
 */
public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (sc.hasNext()) {
            System.out.println(i + " "+sc.nextLine());
            i++;
        }
    }
}

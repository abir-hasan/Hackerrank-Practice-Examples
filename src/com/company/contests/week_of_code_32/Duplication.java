package com.company.contests.week_of_code_32;

import java.util.Scanner;

/**
 * Created by Abir Hasan on 15-May-17.
 */

public class Duplication {
    private static String sExpanded = "";

    static char duplication(int x) {
        return sExpanded.charAt(x);
    }

    public static void main(String[] args) {
        makeString();
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            char result = duplication(x);
            System.out.println(result);
        }
    }

    private static void makeString() {
        String sInit = "0";
        String tInit = "1";
        while (sExpanded.length() < 1002) {
            sExpanded = sInit + tInit;
            sInit = sExpanded;
            tInit = getComplement(sInit);
        }
    }

    private static String getComplement(String sInit) {
        String temp = "";
        for (int i = 0; i < sInit.length(); i++) {
            if (sInit.charAt(i) == '0') {
                temp = temp + "1";
            } else {
                temp = temp + "0";
            }
        }
        return temp;
    }


}



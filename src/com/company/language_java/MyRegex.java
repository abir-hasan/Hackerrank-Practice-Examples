package com.company.language_java;

import java.util.Scanner;

/**
 * Created By Abir Hasan on 24-Nov-19
 *
 * Problem: Practice > Java > Introduction > Java Regex
 */
class MyRegex {

    /*public String pattern = "" +
            "([0-9]|[1-9][0-9]|0[0-9][0-9]|00[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
            "([0-9]|[1-9][0-9]|0[0-9][0-9]|00[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
            "([0-9]|[1-9][0-9]|0[0-9][0-9]|00[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
            "([0-9]|[1-9][0-9]|0[0-9][0-9]|00[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";*/ // This works too

    public String case1 = "[0-9]"; // Covers only one digit
    public String case2 = "[0-9]{2}"; // Covers two digits
    public String case3 = "(0|1)[0-9]{2}"; // Covers 3 digit till 199 including numbers like 034
    public String case4 = "2[0-4][0-9]"; // Covers 3 digit from 200 to 249
    public String case5 = "25[0-5]"; // Covers 3 digit from 250 to 255
    private String create255 = "(" + case1 + "|" + case2 + "|" + case3 + "|" + case4 + "|" + case5 + ")";
    public String pattern = "" +
            "" + create255 + "\\." +
            "" + create255 + "\\." +
            "" + create255 + "\\." +
            "" + create255;

}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

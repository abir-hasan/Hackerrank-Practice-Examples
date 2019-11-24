package com.company.language_java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created By Abir Hasan on 24-Nov-19
 *
 * Problem: Practice > Java > Introduction > Java Currency Formatter
 */
public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUs.format(payment);

        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfCh.format(payment);

        NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFr.format(payment);


        //String india = us.replace("$", "Rs.");
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat nfIn = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = nfIn.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

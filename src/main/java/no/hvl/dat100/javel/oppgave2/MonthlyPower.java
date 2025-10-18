package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (int day = 0; day < usage.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            for (double hourUsage : usage[day]) {
                System.out.printf("%.2f kWh ", hourUsage);
            }
        }
        System.out.println();
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int day = 0; day < prices.length; day++) {
            System.out.print("Day " + (day + 1) + ": ");
            for (double hourPrice : prices[day]) {
                System.out.printf("%.2f ", hourPrice);
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                 sum += usage[day][hour];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        double totalSum = computePowerUsage(powerusage);
        boolean exceeded = totalSum > threshold;



        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}

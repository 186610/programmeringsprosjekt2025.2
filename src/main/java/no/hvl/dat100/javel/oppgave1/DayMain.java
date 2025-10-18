package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import static no.hvl.dat100.javel.oppgave1.DailyPower.computeNorgesPrice;
import static no.hvl.dat100.javel.oppgave1.DailyPower.findPeakUsage;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        System.out.println("Strømpriser gjennom døgnet:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println("Strømforbruk gjennom døgnet:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.printf("Totalt strømforbruk for dagen: %.2f kWh%n", totalUsage);
        double totalPrice= DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("Total kostnad for dagen: %.2f NOK%n", totalPrice);
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("Strømstøtte for dagen: %.2f NOK%n", totalSupport);
        double[] usageExample = {1.2, 0.8, 1.5, 2.0, 0.5};
        System.out.printf("norgespris eksempel: %.2f NOK%n", DailyPower.computeNorgesPrice(usageExample));
        double[] usage = {1.2, 0.8, 1.5, 2.0, 0.5};
        System.out.printf("Størst strømforbruk: %.2f kWh%n", DailyPower.findPeakUsage(usage));
        System.out.printf("Gjennomsnittlig strømforbruk: %.2f kWh%n", DailyPower.findAvgPower(usage));








    }
}

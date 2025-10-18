package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;
        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Strømforbruk gjennom måneden:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        //b
        System.out.println("Strømpriser gjennom måneden:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        //c
        double sumUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("Totalt strømforbruk for måneden %.2f kWh%n", sumUsage);
        double limit = 500.0;
        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, limit);
        if (exceeded) {
            System.out.println("Forbruktet har overskredet grensen på " + limit + " kwh!");
        } else {

        }
    }
}



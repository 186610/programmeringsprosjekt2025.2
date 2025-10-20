package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;

    private double amount;


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0.0;
    }

    public void computeAmount() {
        PowerAgreementType agreement = c.getAgreement();

        switch (agreement) {
            case SPOTPRICE -> amount = computeSpotPrice(usage, prices);
            case POWERSUPPORT -> {
                double spot = computeSpotPrice(usage, prices);
                double support = computePowerSupport(usage, prices);
                amount = spot - support;
            }
            case NORGESPRICE -> amount = computeNorgesPrice(usage);
        }
    }

    private double computeTotalUsageKwh() {
        double total = 0.0;
        for (double[] day : usage) {
            for (double u : day) total += u;
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("Customer number " + c.getCustomer_id());
        System.out.println("Name: " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Agreement: " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage:  %.2f kWh%n", computeTotalUsageKwh());
        System.out.printf("Amount: %.2f NOK%n", amount);
    }
}
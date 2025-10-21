package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave5.CustomerPowerUsageData;

public class InvoiceMain {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("OPPGAVE 5");
        System.out.println("================\n");

        double[][] prices = MonthPowerData.powerprices_month;

        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;


        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.POWERSUPPORT);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.NORGESPRICE);


        Invoice i1 = new Invoice(c1, "January", usage1, prices);
        Invoice i2 = new Invoice(c2, "January", usage2, prices);
        Invoice i3 = new Invoice(c3, "January", usage3, prices);


        Invoice[] invoices = { i1, i2, i3 };
        Invoices.processInvoices(invoices);
    }
}
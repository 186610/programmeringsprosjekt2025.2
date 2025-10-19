package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();



        Customer c = new Customer(
                "Kjartan Kjartansen",
                "Kjartan@example.com",
                1001,
                PowerAgreementType.SPOTPRICE
        );
        System.out.println(c);
        System.out.println();

        c.setEmail("kjartan43@gmail.no");
        c.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("After updates:");
        System.out.println("Name " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Customer id: " + c.getCustomer_id());
        System.out.println("Agreement: " + c.getAgreement());
    }
}

package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers registry = new Customers(5);
        registry.addCustomer(new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE));
        registry.addCustomer(new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE));
        registry.addCustomer(new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT));
        System.out.println("b) Antall registrerte kunder: " + registry.countNonNull());
        System.out.println();
        boolean added = registry.addCustomer(new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE));
        System.out.println("d) addCustomer(Diana) -> " + added);
        System.out.println("Antall registrerte kunder: " + registry.countNonNull());
        System.out.println();
        System.out.println("e) removeCustomer(1003):");
        Customer removed = registry.removeCustomer(1003);
        System.out.println(removed != null ? removed: "Ikke funnet");
        System.out.println("Antall registrerte kunder: " + registry.countNonNull());
        System.out.println();
        System.out.println("f) Alle kunder i registeret:");
        for (Customer c : registry.getCustomers()) {
            if (c != null) {
                System.out.println(c);
                System.out.println();
            }
        }
    }
}

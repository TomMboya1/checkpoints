package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();


        bank.addCustomer("tommy");
        bank.addCustomer("joan");
        bank.addCustomer("betty");


        List<String> customers = bank.getCustomers();
        System.out.println("List of customers in the bank:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
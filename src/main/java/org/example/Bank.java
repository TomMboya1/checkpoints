package org.example;

import java.util.ArrayList;
import java.util.List;

    public class Bank {
        private List<String> customers;

        public Bank() {
            customers = new ArrayList<>();
        }

        public void addCustomer(String customer) {
            customers.add(customer);
        }

        public List<String> getCustomers() {
            return customers;
        }
    }


package org.example.functional_programming;

import java.time.LocalDate;

public class Customer {

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDob() {
        return dob;
    }

    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final LocalDate dob;

    public Customer(String name, String email, String phoneNumber, String address, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dob = dob;
    }
}

package org.example.functional_programming;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isNameValid(String name){
        return name.contains("+0");
    }

    private  boolean isAddressValid(String address){
        return address.contains("//s+$");
    }

    private  boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 10;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isNameValid(customer.getName()) &&
                isAddressValid(customer.getAddress()) &&
                isAdult(customer.getDob());
    }
}

package org.example;

import org.example.functional_programming.Customer;
import org.example.functional_programming.CustomerRegistrationValidator;
import org.example.functional_programming.CustomerValidatorService;

import java.time.LocalDate;

import static org.example.functional_programming.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Prabin@Neupane",
                "prabin.neupane.work@gmail.com",
                "9813907758",
                "sindhupalchok, nepal",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidatorService()
                .isValid(customer));


        /**
         * combinator pattern using functional approach  to validate data.
         */

        var result = isEmailValid()
                .and(isNameValid())
                .and(isAddressValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);


    }
}
package org.example;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {

        hello("Prabin", " ", value -> {
            System.out.println("no lastName provided for " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback ){
        System.out.println(firstName);

        if(lastName != null ){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

}

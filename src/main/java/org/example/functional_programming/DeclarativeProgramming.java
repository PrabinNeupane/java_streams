package org.example.functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.functional_programming.DeclarativeProgramming.Gender.FEMALE;

public class DeclarativeProgramming {

    public static void main(String[] args) {

        //Imperative Programming

        List<Person> people = List.of(
                new Person("Prabin", Gender.MALE),
                new Person("Sisam", FEMALE),
                new Person("RAM", Gender.MALE),
                new Person("SITA", FEMALE),
                new Person("GITA", FEMALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person women : people) {
            if (FEMALE.equals(women.gender)) {
                females.add(women);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }


        //Declarative programming

        people.stream()
                .filter(women -> FEMALE.equals(women.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        private String name;
        private Gender gender;


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }


}

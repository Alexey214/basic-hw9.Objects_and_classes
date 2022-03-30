package com.company;

import java.util.Objects;

public class Autor {
    private final String firstName;
    private final String lastName;

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printingAutorInfo(Autor autor) {
        System.out.println("Имя автора: " + getFirstName() + ", фамилия автора: " + getLastName());
    }
}

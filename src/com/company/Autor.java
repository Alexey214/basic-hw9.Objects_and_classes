package com.company;

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

    public String toString() {
        return "Имя автора: " + this.firstName + ", фамилия автора: " + this.lastName;
    }
}

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

    @Override
    public String toString() {
        return "Имя автора: " + this.firstName + ", фамилия автора: " + this.lastName + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return firstName.equals(autor.firstName) && lastName.equals(autor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}

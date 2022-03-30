package com.company;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Autor nameAutor;
    private int publicationAge;

    public Book(String name, Autor nameAutor, int publicationAge) {
        this.bookName = name;
        this.nameAutor = nameAutor;
        this.publicationAge = publicationAge;
    }


    public String getBookName() {
        return bookName;
    }

    public Autor getNameAutor() {
        return nameAutor;
    }

    public int getPublicationAge() {
        return publicationAge;
    }

    public void setPublicationAge(int publicationAge) {
        this.publicationAge = publicationAge;
    }

    public void printingBookInfo(Book book) {
        System.out.println("Имя книги: " + getBookName() + ", автор: " + getNameAutor() + ", год издания: " + getPublicationAge());
    }

    @Override
    public String toString() {
        return "Имя книги: " + bookName + ", год издания: " + publicationAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}

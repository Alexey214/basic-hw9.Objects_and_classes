package com.company;

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
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Антон", "Чехов");
        Autor autor2 = new Autor("Федор", "Достаевский");
        Book book1 = new Book("Чайка", autor1, 1998);
        Book book2 = new Book("Преступление и наказание", autor2, 2006);
        book1.setPublicationAge(2000);

        autor1.printingAutorInfo(autor1);
        autor2.printingAutorInfo(autor2);
        book1.printingBookInfo(book1);
        book2.printingBookInfo(book2);
    }
}

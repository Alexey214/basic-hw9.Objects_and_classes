package com.company;

import java.util.Arrays;

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
        System.out.println(autor1 + " " + book1);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1);

        System.out.println("\nЗадачи повышенной сложности (средний уровень):");
        Book book3 = new Book("Беда", autor1, 1886);
        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        addBook(books, book3);
        addBook(books, book3);
        printAllArr(books);

        System.out.println("\nЗадачи повышенной сложности (сложный уровень):");
        Library lib = new Library(books.length);
        lib.arrCopy(books);
        lib.printAllLib(books);
        lib.addBookToLib(books, book1);
        lib.arrCopy(books);
        lib.printAllLib(books);
        System.out.println(lib);

    }

    //Средний уровень
    public static Book[] addBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[books.length - 1] != null) {
                System.out.println("Массив заполнен, пожалуйста создайте новый массив");
                break;
            } else if (books[i] == null) {
                books[i] = book;
                System.out.println("Книгa " + book + " успешно добавлена" + " в ячейку " + i);
                break;
            } else {
                System.out.println("Ячейка " + i + " занята");
            }
        }
        return books;
    }

    public static Book[] printAllArr(Book[] books) {
        Book[] arrBooks = new Book[books.length];
        System.out.println(Arrays.toString(books));
        return arrBooks;
    }


}

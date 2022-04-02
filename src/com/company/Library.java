package com.company;

import java.util.Arrays;

public class Library {

    private Book[] lib;

    public Library(int booksLenght) {
        Book[] arrBooks = new Book[booksLenght];
        lib = arrBooks;
        System.out.println(Arrays.toString(lib));

    }

    public Book[] arrCopy(Book[] books) {
        System.arraycopy(books, 0, this.lib, 0, books.length);
        return this.lib;
    }

    @Override
    public String toString() {
        String words = Arrays.toString(lib).replace(",", ":").replace("[", " ").replace("]", "");
        String[] words1 = words.split(":");
        String[][] words2 = new String[5][6];
        int count = 0;
        for (int i = 0; i < words2.length; i++) {
            for (int j = 0; j < words2[0].length; j++) {
                if (j == 0) {
                    words2[i][j] = "The";
                    words2[i][j + 3] = words1[count];
                    count++;
                } else if (j == 2) {
                    words2[i][j] = "by";
                    words2[i][j - 1] = words1[count];
                    count++;
                } else if (j == 4) {
                    words2[i][j] = "was published in";
                    words2[i][j + 1] = words1[count];
                    count++;
                }
            }
        }

        return Arrays.deepToString(words2).replace("  ", " ").replace("[[", "[").replace("]]", "]").replace(",", "");
    }

    public Book[] addBookToLib(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[books.length - 1] != null) {
                System.out.println("Массив заполнен, пожалуйста создайте новый массив");
                break;
            } else if (books[i] == null) {
                books[i] = book;
                System.out.println("Книгa \"" + book + "\" успешно добавлена" + " в ячейку " + i);
                break;
            } else {
                System.out.println("Ячейка " + i + " занята");
            }
        }
        return books;
    }

    public Book[] printAllLib(Book[] books) {
        Book[] arrBooks = new Book[books.length];
        System.out.println(Arrays.toString(books));
        return arrBooks;
    }
}

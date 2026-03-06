package practice_exceptions_generics.library;

import practice_exceptions_generics.library.exceptions.BookNotFoundException;

public class Main {

    public static void main(String[] args){
        Library library = new Library();

        library.addBook(new Book("1994","Оруэлл"));
        library.addBook(new Book("Мартин Иден","Лондон"));
       // library.addBook(new Book("Мартин Иден","Лондон"));
        library.addBook(new Book("ываы Иден","ывавыа"));

        try {
            library.findBook("3483");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!");
        }
    }
}

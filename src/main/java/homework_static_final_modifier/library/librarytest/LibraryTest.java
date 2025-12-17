package homework_static_final_modifier.library.librarytest;

import homework_static_final_modifier.library.Library;

public class LibraryTest {
    public static void main(String[] args){

        Library library = new Library();

        //library.bookTitle - невозможно потому что private
        library.setBookTitle("Война и мир");
        System.out.println("Наименование книги : " + library.getBookTitle());
        //library.author = "Толстой"; - невозможно, потому что protected, а данный класс в другом пакете
        library.setAuthor("Толстой");
        //library.year = 1869; - невозможно, потому что default, а данный класс в другом пакете
        library.setYear(1869);
        library.category = "Роман";

        System.out.println("Автор : " + library.getAuthor());
        System.out.println("Год : " + library.getYear());
        System.out.println("Категория : " + library.category);
    }
}

package homework_first_classes_objects.book;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Война и мир", "Толстой Л.В.");
        book.setAuthor("Пушкин А.С.");
        book.printInfo();
    }
}

package homework_first_classes_objects.book;

public class Book {
    String title;
    String author;

    public Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void printInfo(){
        System.out.println("Название книги : " + this.title);
        System.out.println("Автор книги : " + this.author);
    }

}

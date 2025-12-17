package homework_static_final_modifier.library;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public String getCategory(){
        return category;
    }

    public void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;

    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void setYear (int newYear){
        this.year = newYear;
    }

    public void setCategory(String newCategory){
        this.category = newCategory;
    }

}

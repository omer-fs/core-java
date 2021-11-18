package follows;
/*
    This Book Class follows Single responsibility principle since it takes responsibility of attributes which are
    related to a book only, it does not have methods like searchBook() which are available in separate class as inventory
*/
public class Book implements Product{
    String title;
    String author;
    String ISBN;
    public Book() {
        this.ISBN = "NULL";
    }
    public Book(String ISBN){
        this.ISBN = ISBN;
    }
    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }
    String getAuthor() {
        return author;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String getProductID() {
        return this.ISBN;
    }
}

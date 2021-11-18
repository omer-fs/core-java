package donotfollow;
/*
 Book class does not follow single responsibility principle since it has the feature that are related to a book
 but also, it has a feature that should be followed by an inventory class, example searchBook() method
*/
public class Book {
    String title;
    String author;
    String ISBN;

    public Book() {
        this.ISBN = "NULL";
    }
    public Book(String ISBN) {
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
    String getISBN() {
        return this.ISBN;
    }
    boolean searchBook(follows.Book[] list, follows.Book book) {
        for(follows.Book x: list ){
            if(x.equals(book))
                return true;
        }
        return false;
    }
}

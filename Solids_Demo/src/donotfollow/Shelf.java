package donotfollow;

public class Shelf {
    Book book;
    // Consider book store now wants a feature for Shelf where customer can add favorite books
    // To implement the new functionality, we use a lower-level Book class and create a higher-level Shelf class.
    void addBook(Book book) {

    }
    // Shelf class lets a user add book to shelf or customize the shelf
    // everything looks fine, but it violates the dependency inversion principle since high level class depending on lower level class
    // suppose our book store now added DVDs along with books, it becomes clear that we need to modify the Shelf class
    // which in turn violates the open/close principle
    // the solution to overcome this problem is to create an abstraction layer for the lower level classes such as Book, DVD
    void customizeShelf() {

    }
}

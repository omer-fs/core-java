package follows;
/*
    This class also follows the single responsibility principle since its sole responsibility is to view the inventory
    i.e., it can search for a book, which is a normal task in inventory view
*/
public class InventoryView {
    Book book;
    InventoryView(Book book) {
        this.book = book;
    }
    boolean searchBook(Book[] list, Book book) {
        for(Book x: list ){
            if(x.equals(book))
                return true;
        }
        return false;
    }

}

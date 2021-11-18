package follows;

public class DiscountManager {
    void processBookDiscount(BookDiscount discount){
        discount.getBookDiscount();
    }
    /*
    This class DiscountManager follows open/close principle since we are allowing extension, but we are not modifying any class
    since we are creating an interface BookDiscount, and we are implementing it in required books discount classes, and we are making use of the method of BookDiscount in DiscountManager class we need worry about modification
     */
}

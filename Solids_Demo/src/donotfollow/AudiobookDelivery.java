package donotfollow;

public class AudiobookDelivery extends BookDelivery{
    @Override
    void getDeliveryLocation() {
        /* This can't be implemented
           Since audiobooks can't be delivered
           we can make some changes in getDeliveryLocation() method, however it violates the liskov substitution principle
           after the modification we cannot replace BookDelivery superclass with AudiobookDelivery subclass
        */
    }
}

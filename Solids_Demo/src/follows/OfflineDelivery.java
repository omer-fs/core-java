package follows;

public class OfflineDelivery extends BookDelivery{
    void getDeliveryLocation() {
        // this method gets the delivery location of the customer
    }
    /*
    this extra layers helps in proper implementation of liskov substitution principle
    since offlineDelivery superclass can be replaced by hardcoverDelivery class without causing any problem to the application
    */

}

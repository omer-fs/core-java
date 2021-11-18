package follows;

public class OnlineDelivery extends BookDelivery{
    void getSoftwareOptions() {
        //this method get the details of software requirements which are required to play the audiobook
    }

    /*
    this extra layer in inheritance hierarchy helps in proper implementation of liskov substitution principle
    since OnlineDelivery super class can be replaced by AudiobookDelivery subclass without causing problem to the application

     */
}

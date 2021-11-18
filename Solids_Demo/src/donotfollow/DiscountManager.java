package donotfollow;

public class DiscountManager {
    void processCookbookDiscount(CookbookDiscount discount) {
        discount.getCookbookDiscount();
    }
    void processBiographyDiscount(BiographyDiscount discount) {
        discount.getBiographyDiscount();
    }

    // The DiscountManager Class breaks the open/close principle since earlier we wanted only one class CookbookDiscount
    // But when we want to give discount on another book, in our case biography book
    // we needed to modify our DiscountManager class which is against Open/Close principle
}

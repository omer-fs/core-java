package follows;

public interface Product {
    String getProductID();
    // this interface Product helps in achieving loose Coupling, and also it removes the direct dependency of lower level
    // Also having a Product interface makes it easier for us to add new products, suppose our book store now wants to add magazines,
    // then customers can add that to their shelf without violating the opens/close principle
}

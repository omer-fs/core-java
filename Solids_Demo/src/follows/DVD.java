package follows;

public class DVD implements Product{
    String barcode;
    public DVD(){
        this.barcode="11111";
    }
    public DVD(String barcode){
        this.barcode = barcode;
    }
    @Override
    public String getProductID() {
        return this.barcode;
    }
}

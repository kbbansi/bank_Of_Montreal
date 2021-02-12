public class Product implements ProductPricingService {
    private String productID; // unique identifier
    private double value; //(current price)
    private ProductKind productKind; // enums for kind of product
    private int quantity;

    public Product(String productID, double value, ProductKind productKind, int quantity){
        this.productID = productID;
        this.value = value;
        this.productKind = productKind;
        this.quantity = quantity;
    }

    //getters and setters


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public ProductKind getProductKind() {
        return productKind;
    }

    public void setProductKind(ProductKind productKind) {
        this.productKind = productKind;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }


}

public interface ProductPricingService {
    double price(String exchange, String ticker); // method for valuating a stock trade
    double price(String exchange, String contractCode, int month, int year); // method for valuating a future
}

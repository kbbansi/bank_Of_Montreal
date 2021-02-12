import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Trade service will implement methods in montreal traded products interface */
public class TradeService implements MontrealTradedProducts {
    /**list of new or unregistered products for trading*/
   private List<Product> products = new ArrayList<>();

    List<Product> tradeProducts = new ArrayList<>(); /** list of registered products for trading*/
    Map<Product, Integer> productsToTrade = new HashMap<>(); /** key value pair of trade-able products*/


    public TradeService(){}

    public TradeService(List<Product> products, List<Product> tradeProducts) {
        this.products = products;
        this.tradeProducts = tradeProducts;
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if (!products.isEmpty()){ // check if list of products is empty
            for (Product p : products) { // loop through each product
                if (product.getProductID().equals(p.getProductID())){ // get product id of each product and compare
                    throw new ProductAlreadyRegisteredException(product.getProductID() + " Already Exists"); // throw exception
                }else {
                    tradeProducts.add(product); // add product to trade products list
                }
            }
        }
    }

    @Override
    public void trade(Product product, int quantity) {
        if (!tradeProducts.isEmpty()){
            for (Product p : tradeProducts) {
                productsToTrade.put(p, p.getQuantity());
            }
        }
    }

    @Override
    public int totalTradeQuantityForDay() {
        int totalTradeQuantityToday = 0;
        if (!productsToTrade.isEmpty()){ // productsToTrade is a collection of trades that have been made
            for (int i : productsToTrade.values()) {
                totalTradeQuantityToday=+ i;
            }
        }
        return totalTradeQuantityToday;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}

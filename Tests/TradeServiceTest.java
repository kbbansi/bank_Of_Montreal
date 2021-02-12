import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TradeServiceTest {

        @Mock
        TradeService tradeService;

        @Test
         void addNewProductTest() throws ProductAlreadyRegisteredException {
            Product product = new Product("ABC", 20.00, ProductKind.STOCKS, 30);
            TradeService tradeService = new TradeService();

//            assertThrows();
        }

//        @Test void addNewProductThrowsException() throws ProductAlreadyRegisteredException {
//            Product products = mock(Product.class);
//            TradeService tradeService = new TradeService(Mockito.anyList(), Mockito.anyList());
//            // tradeService.addNewProduct(products);
//
//            doThrow(ProductAlreadyRegisteredException.class).when(tradeService).addNewProduct(products);
//        }

}
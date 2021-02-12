// Product Already Registered Exception will catch and throw custom exception messages
public class ProductAlreadyRegisteredException extends Exception{
    public ProductAlreadyRegisteredException(String message){
        super(message);
    }
}

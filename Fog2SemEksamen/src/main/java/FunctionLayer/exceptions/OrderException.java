
package FunctionLayer.exceptions;

public class OrderException extends Exception{

    public OrderException(String msg) {
        super(msg);
    }
    
    public OrderException(Throwable throwException) {
        super(throwException);
    }
    
    
}

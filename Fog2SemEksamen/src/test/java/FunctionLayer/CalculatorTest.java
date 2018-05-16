
package FunctionLayer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCalculate() {
        Calculator calc = new Calculator();
        Order order = new Order(-800,600,200,1);
        Carport result = calc.calculate(order);
        assertEquals(result.getSpær(),14);
        assertEquals(result.getStolpeL(),8);
        
    }
    
    
    
}

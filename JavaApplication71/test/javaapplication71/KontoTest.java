package javaapplication71;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void testSetSaldo() {

        Konto k = new Konto();
        k.setSaldo(-100);

        assertEquals(k.setSaldo(-100), 0);

    }

    
    
    
    
}

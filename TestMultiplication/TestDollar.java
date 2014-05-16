import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDollar {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
      
        assertEquals(new Dollar(10), five.times(2));
 
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)) );
        assertFalse(new Dollar(5).equals(new Dollar(6)) );
    }
    
    @Test
    public void testFranceMultiplication() {
        France five = new France(5);
        
        assertEquals( new France(10), five.times(2) );
        assertEquals( new France(15), five.times(3) );
    }

}

<<<<<<< HEAD
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
        five.times(2);
        assertEquals(10, five.amount);
        // fail("Not yet implemented");
    }

}
=======
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
>>>>>>> ec7466880218603d78c9cc2e81b63039d13bdc39

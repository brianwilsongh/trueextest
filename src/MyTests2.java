import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;


public class MyTests2 extends TestCase {
	
	@Test
    public void testSimple() {
        ThirtySecondsFormatter tsf = new ThirtySecondsFormatter(); // MyClass is tested

        // assert statements with three sample inputs
        assertEquals("Input 105.033 should return 105 dollars and 1/32 dollar as 105-01", "105-01", 
        		tsf.buildFormattedString(105.033));
        assertEquals("Input 0.000 should return 0 dollars and 0/32 dollar as 00-00", "00-00", 
        		tsf.buildFormattedString(00.000));
        assertEquals("Input 923432.0352342342 should return 923432 dollars and 1/32 dollar as 923432-01", "923432-01", 
        		tsf.buildFormattedString(923432.0352342342));

    }
	
	public void testNull(){
		ThirtySecondsFormatter tsf = new ThirtySecondsFormatter(); // MyClass is tested
		assertEquals("Test null", "", tsf.buildFormattedString(null));
	}

}

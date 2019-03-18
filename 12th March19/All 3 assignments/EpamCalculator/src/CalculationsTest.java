import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationsTest {

	

Calculations cl = new Calculations();

	

	@Test
	public void testAdd() {
		assertEquals(300, cl.Add(100,200));
		
		
	}
	@Test
	public void testMul() {
		assertEquals(20000, cl.Multiply(100,200));
		
		
	}
	@Test
	public void testDiv() {
		assertEquals(5, cl.Divide(10,2));
		Assertions.assertThrows(ArithmeticException.class, () -> cl.Divide(10, 0));
		
		
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterestTesting {

	InterestCalculations ic = new InterestCalculations();

	@Test
	public void SimpleInterestTesting() {
		assertEquals(2500,ic.SimpleInterest(10000, 5, 5));
		assertEquals(7.199999809265137,ic.SimpleInterest(8000, 1, 0.09f));
		//assertEquals(2500,ic.SimpleInterest(10000, 5, 5));
		
	}
	
	@Test
	public void CompoundInterestTesting() {
		assertEquals(1335.43310546875,ic.CompoundInterest(1200f, 2f,  5.4f));
		assertEquals(5025.0546875,ic.CompoundInterest(5000, 0.05f,  10));
	}

}

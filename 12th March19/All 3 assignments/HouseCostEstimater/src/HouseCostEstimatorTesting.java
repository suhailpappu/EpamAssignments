import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HouseCostEstimatorTesting {

	HouseCostEstimator hce = new HouseCostEstimator();
	

	@Test
	void CostEstimatorTesting() {
		assertEquals(1200000,hce.CostEstimator(0, 1000, false));
		assertEquals(1050000,hce.CostEstimator(1, 700, false));
		assertEquals(1530000,hce.CostEstimator(2, 850, false));
		assertEquals(1500000,hce.CostEstimator(3, 600, true));
		assertEquals(120000,hce.CostEstimator(0, 100, false));
	}

}

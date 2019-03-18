/**
 * To calculate simple and compound interest.
 * @author suhailpappu
 *
 */
public class HouseCostEstimator {
	/**
	 * To Estimate the cost of the house by some materials
	 * @param materialType
	 * @param area
	 * @param automatedHome
	 */
	public int CostEstimator(int materialType,int area,boolean automatedHome) {
		int cost=0;
		switch(materialType) {
			case 0:
				cost=1200;
				
				break;
			case 1:
				cost=1500;
				
				break;
			case 2:
				cost=1800;
				
				break;
			case 3:
				if(automatedHome) {
					cost=2500;
				}
				break;
			default:
				cost=1200;
				
		}
		
		return area*cost;
		
	}
	
	
}

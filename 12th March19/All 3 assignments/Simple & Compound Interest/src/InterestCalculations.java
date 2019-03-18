
public class InterestCalculations {
	
	public float SimpleInterest(float p,float r,float t) {
		
		float si = (p * t * r) / 100; 
		
		return si;
		
	}
	
	double principle = 10000, rate = 10.25, time = 5; 
	  
    /* Calculate compound interest */
    
    
	public float CompoundInterest(float p,float r,float t) {
			
		float ci = (float) (p * 
	            (Math.pow((1 + r / 100), t))); 
			
			return ci;
			
		}
	
	
	
	
}

/**
 * Calculator featuring addition,multiplication 
 * and division of any two numbers 
 * @author suhailpappu
 *
 */
public class Calculations {

	
	/**
	 * finds addition of two numbers
	 * @param a
	 * @param b 
	 * @return int addition of two numbers
	 */
	
	public int Add(int a,int b){
		int add = a+b;
		return add;
	}
	/**
	 * finds multiplication of two numbers
	 * @param a
	 * @param b 
	 * @return int multiplication of two numbers
	 */
	
	public int Multiply(int a,int b){
		int mul = a*b;
		return mul;
	}
	
	/**
	 * finds division of two numbers
	 * @param a
	 * @param b 
	 * @return int division of two numbers
	 */
	
	public int Divide(int a,int b){
		int div ;
		if(a==0) {
			throw new ArithmeticException("Cant divide by zero");
		}else {
			div = a/b;
		}
		
		
		return div;
	}
	
}

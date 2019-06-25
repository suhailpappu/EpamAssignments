
public class ReplaceTDD {
	
	
	static public String word(String s) {
		StringBuilder sb = new StringBuilder(s);
		String a="";
		if(s.length()>2) {
		
			sb.setCharAt(s.length()-1, s.charAt(s.length()-2));
			sb.setCharAt(s.length()-2, s.charAt(s.length()-1));
			 a = sb.toString();
		
		}else if(s.length()==2) {
			sb.setCharAt(s.length()-1, s.charAt(s.length()-2));
			sb.setCharAt(s.length()-2, s.charAt(s.length()-1));
			 a = sb.toString();
		}else if(s.length()==1){
			a=s;
		}else {
			return s;
		}
		
		return a;
		
	}
	
	static public String RemoveAFromString(String s) {
		String a = s.toUpperCase();
		String b ="";
		if(a.charAt(0)=='A'&&a.charAt(1)=='A') {
			 b = a.substring(2,a.length());
			
		}else if(a.charAt(0)=='A') {
			 b = a.substring(1,a.length());
			
			
		}else if(a.charAt(1)=='A') {
			String c = a.substring(2,a.length());
			b = a.charAt(0)+c;
		}else {
			b=s;
		}
		return b.toUpperCase();
		
	}
	
	


}


@FunctionalInterface
interface a {
	public String x(String y);
}

interface b {
	public int y (String z);
}

public class MethodRefLec {

	public static void main(String[] args) {
		
      	a a2 = MethodRefLec::copyString;
      	
      	String r = a2.x("bobby lashley");
		
      	System.out.println(r);
      	
      	b b2 = String::length;
      	
      	System.out.println(b2.y("heyyoi"));
      	
	}
	
	public static String copyString(String x) {
		
		return x.toUpperCase();
	}
}

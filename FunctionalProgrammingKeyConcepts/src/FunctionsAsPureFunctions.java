
public class FunctionsAsPureFunctions {

	private static int r = 22;
	
	public static void main(String[] args) {
		//add below is a pure function
		//add2 below is inpure function
		// it has no side effects
		// and its output is only dependent on its input params
	
	    //System.out.println(r);
	    
	    System.out.println(add(2,3));
	    System.out.println(r);
	    System.out.println(add2(2,3));
	    System.out.println(r);
	}
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int add2(int a, int b )
	{
		r = 83;
		return a + b;
	}
}

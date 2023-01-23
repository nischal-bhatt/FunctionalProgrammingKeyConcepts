import java.util.function.Function;

public class FunctionsAsFirstClassCitizens {

	public static void main(String[] args) {
		
		Function<String,String> rrr = (x) -> x.toUpperCase(); 
		String rrr1 = toUpperCaseIt(rrr);
		System.out.println(rrr1);
	}
	
	public static String toUpperCaseIt(Function<String,String> s)
	{
		String rrr = s.apply("heya");
	    return rrr;
	 }
}

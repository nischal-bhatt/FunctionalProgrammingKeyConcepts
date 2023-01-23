import java.util.function.Supplier;

@FunctionalInterface
interface add {
	public int adder(int a,int b);
}

public class FunctionalProgrammingInDepth {

	public static void main(String[] args) {
		
		add a = (a1,b1) -> a1 + b1;
		
		addNumbers(a);
		
		Supplier<Integer> x = ()-> 5;
		System.out.println(SupplyNumber(x));
	}
	
	private static void addNumbers(add b)
	{
		int sum  = b.adder(3,5);
	    System.out.println(sum);
	}
	
	private static int SupplyNumber (Supplier<Integer> a)
	{
		return a.get();
	}
}

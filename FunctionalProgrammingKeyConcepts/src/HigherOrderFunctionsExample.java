
@FunctionalInterface
interface a1 {
	public int add(int a, int b);
}

@FunctionalInterface
interface b1 {
	public int subtract (int a, int b );
}

public class HigherOrderFunctionsExample {

	public static void main(String[] args) {
		b1 rrr = HigherOrderFunction((a,b) -> a*b);
		
		System.out.println(rrr.subtract(8, 9));
	}
	
	public static b1 HigherOrderFunction(a1 A)
	{
		System.out.println(A.add(2, 3));
		
		return (t,y) -> t-y + 98;
	}
	
	
}

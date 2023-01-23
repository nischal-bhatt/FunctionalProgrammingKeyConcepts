
public class TailCallOptimization {

	public static void main(String[] args) {
		System.out.println(recursiveFac(4));
		System.out.println(tailCall(4,1));
	}
	
	private static long tailCall(int n, int a) {
		
		if (n <= 1)
		{
			return a;
		}
		
		return tailCall(n-1, n*a);
	}

	public static long recursiveFac(int n)
	{
		if(n <= 1)
		{
			return 1;
		}else {
		
		return n * recursiveFac(n-1);
		}
	}
}

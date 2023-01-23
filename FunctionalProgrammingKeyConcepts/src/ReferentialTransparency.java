
public class ReferentialTransparency {

	public static void main(String[] args) {
		
		System.out.println(add(2,multiply(2,2)));
		System.out.println();
		System.out.println(add(2,4));
	}
	
	public static int add (int a, int b )
	{
		return a + b;
	}
	
	//this is not referentially transparent
	public static int multiply(int a, int b)
	{
		System.out.println("multiplying....");
		return a*b;
	}
}

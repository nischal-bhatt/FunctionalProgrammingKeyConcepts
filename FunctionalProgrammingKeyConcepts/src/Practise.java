
@FunctionalInterface
interface y {
	public void print(String x);
}

@FunctionalInterface
interface g {
	public int add (int a, int b);
}

@FunctionalInterface 
interface l {
	public int add (int a, int b);
}

public class Practise {

	public static void main(String[] args) {
		
		y x = (a ) -> System.out.println(a);
		
		x.print("hehe");

		g h = (a,b) -> a+b;
		
		int qq = h.add(22, 3);
		System.out.println(qq);
		
		l e = (a,b) -> {
			
			System.out.println("hello world");
			return a + b;
			
		};
	
		int uu = e.add(9, 10);
		
		System.out.println(uu);
	}

}

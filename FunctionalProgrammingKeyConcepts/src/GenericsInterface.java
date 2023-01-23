
@FunctionalInterface
interface FunctionalGenerics<T,R> {
	
	R execute(T t);
}

public class GenericsInterface {

	public static void main(String[] args) {
	
		
		FunctionalGenerics<String,String> fg = (a) ->  a + "b";
		FunctionalGenerics<Integer,String> fg1 = (a) ->  a + "b";
		
		String x = fg.execute("get");
		        // cannot --> execute(23);
		String y = fg1.execute(23);
		
		
		System.out.println(x);
		System.out.println(y);
		
	}

}

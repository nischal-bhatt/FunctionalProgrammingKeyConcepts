import java.util.function.Function;

@FunctionalInterface
interface Consumer<T> {
	
	void accept (T t);
	
	default Consumer<T> thenAccept(Consumer<T> c2)
	{
		return (T t) -> {
			System.out.println("hey");
			this.accept(t);
			c2.accept(t);
		};
	}
}

public class ChainingMethod {

	public static void main(String[] args) {
		
		Consumer<String> con = s -> System.out.println(s);
		
		Consumer<String> con2 = s-> System.out.println(s);
		
		//con.accept("hello");
		//con2.accept("bye");
		
		Consumer<String> xx = con2.thenAccept(con);
		
		
		xx.accept("basicPimp");
		
		Function<Integer,Integer> f1 = s -> s+2;
		Function<Integer,Integer> f2 = x -> x * 2;
		
		Function<Integer,Integer> rrrr = f1.andThen(f2);
	    
		System.out.println(rrrr.apply(6));
	}
}

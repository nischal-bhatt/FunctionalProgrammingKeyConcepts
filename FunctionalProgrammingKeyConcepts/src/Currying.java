import java.util.function.Function;

public class Currying {

	public static void main(String[] args) {

		Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

		int yyy=fun1.apply(3).apply(8);
	    System.out.println(yyy);
	    
	    Function<Integer,Integer> ra = fun1.apply(3);
	    
	    System.out.println(ra.apply(7));
	    System.out.println(ra.apply(88));
	    System.out.println(ra.apply(92));
	    
	}
}

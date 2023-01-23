import java.util.function.BiFunction;

public class BiFunctionLec {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, String> a = (a1, a2) -> {
			return String.valueOf(a1 + a2);
		};
     
		System.out.println(a.apply(300, 7).length());
		
	}
}

import java.util.function.UnaryOperator;

public class UnaryOpLec {

	public static void main(String[] args) {
		UnaryOperator<Integer> a1 = (a2) -> {
			return a2 * a2;
		};
		
		System.out.println(a1.apply(3));
	}
}

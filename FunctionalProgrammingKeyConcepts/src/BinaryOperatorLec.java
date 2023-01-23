import java.util.function.BinaryOperator;

public class BinaryOperatorLec {

	public static void main(String[] args) {

		BinaryOperator<String> a = (a1, a2) -> a1 + "yi"+ a2;
	
	    System.out.println(a.apply("hey", "bish"));
	}
}

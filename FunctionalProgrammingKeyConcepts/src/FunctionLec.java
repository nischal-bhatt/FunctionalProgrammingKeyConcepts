import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLec {

	public static void main(String[] args) {

		Function<String, Integer> a = (a1) -> {

			int x = a1.length();
			return x;

		};
		
		List<String> bb= new ArrayList<>();
		bb.add("hi");
		bb.add("nish");
		
		findOutLengthOfStrings(bb,a);
		

	}

	private static void findOutLengthOfStrings(List<String> bb, Function<String, Integer> a) {
		
		for(String x: bb)
		{
			System.out.println(a.apply(x));
		}
		
	}
}

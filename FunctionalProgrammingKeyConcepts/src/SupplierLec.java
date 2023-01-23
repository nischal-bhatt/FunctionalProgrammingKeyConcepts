import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierLec {

	public static void main(String[] args) {

		Supplier<List<String>> r = () -> {

			List<String> a = new ArrayList<>();
			a.add("hey");
			a.add("nish");
			return a;

		};
		
		List<String> r1 = r.get();
		
		for(String x : r1)
		{
			System.out.println(x);
		}
	}
}

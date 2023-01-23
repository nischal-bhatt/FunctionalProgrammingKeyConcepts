import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLec {

	public static void main(String[] args) {

		Predicate<String> x = (y) -> {
			if (y.equals("nish")) {
				return true;
			} else {
				return false;
			}
		};
		
		
		List<String> y = new ArrayList<>();
		y.add("anand");
		y.add("nish");
		y.add("boy");
		y.add("nish");
		
		for (int i =0; i<y.size(); i++)
		{
			if (x.test(y.get(i)))
			{
				System.out.println("nish");
			}else {
				System.out.println("faltu");
			}
		}
	}
}

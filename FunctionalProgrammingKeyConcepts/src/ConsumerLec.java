import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLec {

	public static void main(String[] args) {
        
		Consumer<String> b = (r) -> System.out.println(r);
		
		List<String> a = new ArrayList<>();
		
		a.add("hey");
		a.add("nish");
		
		for (int i =0; i<a.size(); i++)
		{
			b.accept(a.get(i));
		}
		
	}
}

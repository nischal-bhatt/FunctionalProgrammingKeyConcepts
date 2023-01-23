import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ObservingTheStream {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>();
		
		a.add("hey");
		a.add("no");
		a.add("yes");
		
		Optional<String> x1  =a.stream().reduce((x,y) -> x.toUpperCase()+y);
	
		String rrr=x1.orElseGet(() -> "nothing");
		
		System.out.println(rrr);
	}
}

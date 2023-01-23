import java.util.Optional;

public class MapAndFlatMap {

	public static void main(String[] args) {
		
		Optional<Integer> x = Optional.of(33);
		
		Optional<Integer> y =x.flatMap((e) -> Optional.of(e+18));
		
		System.out.println(y.orElseGet(() -> 0));
	}
}

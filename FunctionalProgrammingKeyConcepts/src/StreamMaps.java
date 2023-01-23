import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMaps {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		
		List<Integer> rrr = stream.map((e) -> e + 3)
		.collect(Collectors.toList()); //stream will close! 
		
		rrr.forEach((aaa) -> System.out.println(aaa));
		
		
		//stream.map(e -> e * 3).collect(Collectors.toList());
		
		
		Stream<Integer> stream1 = Stream.of(1,7,9);
		
		Optional<Integer> aaaa =stream1.reduce((x,y) ->{ 
			  System.out.println("adding");
			return x - y;}
		
				);
		
		int gg=aaaa.orElseGet(() -> 0);
		
		System.out.println(gg);
		
		//if you dont perform terminal operations,
		// then streams will not execute- they are lazy
	 
		NumericStreams();
	
	}

	private static void NumericStreams() {

		IntStream ints = IntStream.of(1,2);
		
		
		
		List<Integer> aaa=ints.boxed().collect(Collectors.toList());
		
		IntStream intt = IntStream.of(1,1,1,9);
		
		int x = intt.sum();
		System.out.println(x);
		
		IntStream inttt = IntStream.of(1,1,1,9);
		
		OptionalInt aaaa =inttt.max();
		
		int g = aaaa.orElseGet(() -> 8);
		
		
		System.out.println(g);
		
		IntStream intttttt = IntStream.of(2,9);
		
		OptionalDouble ssss =intttttt.average();
		
		double x12 =ssss.orElseGet(() -> 8.76);
		
		System.out.println(x12);
	}
}

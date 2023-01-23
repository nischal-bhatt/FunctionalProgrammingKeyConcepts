import java.util.List;
import java.util.stream.Collectors;

public class StateFulStateless {

	public static void main(String[] args) {
		//stateful
		List<Integer> list = List.of(10,9,8,7,6);
		
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		
		for (int i =0; i<collect.size(); i++)
		{
			System.out.println(collect.get(i));
		}
		System.out.println("----------------");
		List<Integer> list1 = List.of(10,9,8,7,6);
		//stateless
		List<Integer> collect1 = list1.parallelStream().filter((e) -> e > 7).collect(Collectors.toList());
		
		for (int i =0; i<collect1.size(); i++)
		{
			System.out.println(collect1.get(i));
		}
		
		
	}
}

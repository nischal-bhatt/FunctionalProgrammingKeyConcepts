import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Studentstud {
	private int age;

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Studentstud(int age) {
		super();
		this.age = age;
	}

}

public class StreamsAndParallelStreams {

	public static void main(String[] args) {

		List<Studentstud> list = new ArrayList<>();

		list.add(new Studentstud(23));
		list.add(new Studentstud(56));
		list.add(new Studentstud(45));
		list.add(new Studentstud(70));

		//stream pipeline
		List<Studentstud> aa = list.stream()
				.filter((s) -> s.getAge() > 46)
				.filter(s->s.getAge() > 59)
				.collect(Collectors.toList());

		for (Studentstud abc : aa) {
			System.out.println(abc.getAge());
		}

	}
}

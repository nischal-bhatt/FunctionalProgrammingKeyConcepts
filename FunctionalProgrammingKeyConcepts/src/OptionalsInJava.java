import java.util.Optional;

class Cat {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cat (String name)
	{
		this.name = name;
	}
	
}
public class OptionalsInJava {

	public static void main(String[] args) {
		Optional<Cat> r = findCat("nish");
		//optional were meant to be used as a return type!
		r.ifPresent((a)->System.out.println(a.getName()));
		
		Cat rr = r.orElseGet(() -> new Cat("no name"));
	    System.out.println(rr.getName());
	    
	    Optional<String> aa = r.map(Cat::getName);
	    aa.ifPresent((rrr) -> System.out.println(rrr));
	
	    String age = aa.orElseGet(() -> "jojo");
	    System.out.println("hi"+age);
	}
	
	private static Optional<Cat> findCat(String name)
	{
		//Cat c = null;
		Cat c = new Cat("threat");
		return Optional.ofNullable(c);
	}
}

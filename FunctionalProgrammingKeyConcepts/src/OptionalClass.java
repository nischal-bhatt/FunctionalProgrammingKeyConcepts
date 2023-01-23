import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String val = "A String";
		Optional<String> optional = Optional.empty();

		// String val2 = optional.get();

		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("nothing");
		}

		// Optional<String> optional2 = Optional.of(val);
		Optional<String> optional2 = Optional.empty();
		String x = optional2.orElseGet(() -> "humn");

		System.out.println(x);

		operators();

	}

	private static void operators() {
		System.out.println("continuing");

		Optional<String> x = Optional.of("56");

		Optional<Integer> r = x.map((val) -> Integer.valueOf(x.get()));
		 System.out.println(x.map((val) -> Integer.valueOf(x.get())));
		 System.out.println(x.flatMap((val) -> Optional.of(Integer.valueOf(val))));
		System.out.println(r);
		
		System.out.println(r.orElseGet(() -> 3));

		Optional<Integer> x1 = Optional.of(23);

		Optional<Integer> x2 = x1.filter(rrr -> rrr != 23);

		System.out.println(x2.orElseGet(() -> 3389));

		Optional<Integer> r1 = x.flatMap((val) -> Optional.of(Integer.valueOf(val)));

		System.out.println(r1.orElseGet(() -> 3));
		
		System.out.println(r1);

		optionalExample();
	}

	private static void optionalExample() {
		Optional<Engineer> engineer = Optional.of(new Engineer(Optional.of("Engineer98")));

        System.out.println(engineer.map(value -> value.getName()));

        System.out.println(engineer.flatMap(value -> value.getName()));
		
       // Optional<String> r = Optional.of("jim");
        Optional<String> r = Optional.empty();
        r.ifPresent(val -> System.out.println(val));
        r.ifPresentOrElse(val -> System.out.println(val), ()->System.out.println("nothing"));
	
	    Optional<String> rrr = Optional.of("mayadolas");
	 //  Optional<String> rrr = Optional.empty(); 
	    Optional<String> qrcode=rrr.or(() -> Optional.of("jjj") );
	    
	    //System.out.println(rrr.get());
	    System.out.println(qrcode.get());
	}

}

class Engineer {
	 private Optional<String> name;

	 public Engineer(Optional<String> name)
	 {
		 this.name = name;
	 }
	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}
	 
	 
}

import java.util.function.Predicate;

public class PreExistingFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = (a) -> {

			if ((Integer) a > 10) {
				return true;
			}
			return false;
		};

		System.out.println(p.test(88));

		Predicate<String> p1 = (a) -> {
			if (a.length() > 0) {
				return true;
			} else {
				return false;
			}

		};

		System.out.println(p1.test(""));
		System.out.println(p1.test("hqy"));
		
	}
}


@FunctionalInterface
interface singleFunctionInterface {
	public String returnString();
}

public class Lambda {

	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("yoyo"));
		t.start();

		singleFunctionInterface y = () -> {
			System.out.println("printing");
			return "hi";

		};
		
		printString(y);
		
		//how java implemented lambdas under the hood
	}

	public static void printString(singleFunctionInterface r) {
		System.out.println(r.returnString());
	}
}

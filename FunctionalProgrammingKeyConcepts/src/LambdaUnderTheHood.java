
@FunctionalInterface
interface MyFunctionalInterface {
	public void print();
}

public class LambdaUnderTheHood {

	public static void main(String[] args) {

		MyFunctionalInterface a = new MyFunctionalInterface() {

			@Override
			public void print() {
				System.out.println("heya");

			}

		};
		
		a.print();
		
		//lambdas use type inference and invokedynamicFunctionality
		//optimise the memory!
		// dont create class files anyhow
		MyFunctionalInterface b = () -> System.out.println("im light");
		
		b.print();

	}

}

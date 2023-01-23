import java.util.stream.IntStream;

public class FunctionalAndImperative {

	 public static void main(String[] args) {
		 //imperative
		 int sumOfEvens = 0;
		 
		 for (int i =0; i<=100; i++)
		 {
			 if (i % 2 != 0)
			 {
				 sumOfEvens = sumOfEvens + i;
				 //sumOfEvens is being mutated!
			 }
		 }
		 
		 System.out.println(sumOfEvens);
		 
		 declarative();
		 
	}

	private static void declarative() {
		
		//Declarative
		int sumOfEvens = IntStream.rangeClosed(0, 100)
		.filter(i -> i % 2 != 0)
		.reduce((p,q)-> p + q)
	    .getAsInt();
		// this code is threadsafe
		
		System.out.println(sumOfEvens);
		
	}
}

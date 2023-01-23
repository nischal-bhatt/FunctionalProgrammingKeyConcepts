
interface Task {
	void doTask();
}

public class ClosureExample {
	private static int val = 222817;
	public static void main(String[] args) {
        
		
		
		Task t = () -> {
        	  System.out.println(val);
        	  System.out.println("completed");
          };
          
          //t is a closure which is using the free variable
          //present in its lexical scope
          
          x.printValue(t);
	}

	
}

class x {
	public static void printValue(Task t) {
		t.doTask();
	}
}


@FunctionalInterface
interface qor {
	public void doTask(String x);
}

public class LazyEvaluations {

	public static void main(String[] args) {
		
		qor QOR = (s) -> System.out.println(s);
		
		String r = "nish";
		
		if (r.equals("nish"))
		{
			QOR.doTask("heyhey");
		}else {
			System.out.println("bye");
		}
		
	}
}

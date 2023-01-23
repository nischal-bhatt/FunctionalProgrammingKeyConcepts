import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");
		System.out.println(ForkJoinPool.getCommonPoolParallelism());

		ForkJoinPool pool = new ForkJoinPool(2);

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {

			list.add(new Employee("a", 1));
			list.add(new Employee("b", 2));
			list.add(new Employee("c", 3));
			list.add(new Employee("d", 4));
			list.add(new Employee("e", 5));
			list.add(new Employee("f", 6));
		}

		long v = pool.submit(() -> list.parallelStream().filter(e -> {
			System.out.println(Thread.currentThread().getId());
			return e.getSalary() > 1;
		}).count()).get();

		System.out.println(v);
	}
}

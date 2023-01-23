import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class ParallelStreams {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		
		for (int i= 0; i<100; i++)
		{
			list.add(new Employee("a",20));
			list.add(new Employee("b",30));
			list.add(new Employee("c",40));
			list.add(new Employee("d",50));
			list.add(new Employee("e",60));
			list.add(new Employee("f",70));
			list.add(new Employee("g",80));
			list.add(new Employee("h",90));
			list.add(new Employee("i",100));
		}
		
		long st = System.currentTimeMillis();
		long rr =list.stream().filter(e -> e.getSalary() > 30).count();
		long endTime = System.currentTimeMillis();
		System.out.println(rr);
		System.out.println(endTime-st);
		System.out.println();
		System.out.println();
		System.out.println();
		long st1 = System.currentTimeMillis();
		long rr1 =list.parallelStream().filter(e -> e.getSalary() > 30).count();
		long endTime1 = System.currentTimeMillis();
		System.out.println(rr1);
		System.out.println(endTime1-st1);
	}
}

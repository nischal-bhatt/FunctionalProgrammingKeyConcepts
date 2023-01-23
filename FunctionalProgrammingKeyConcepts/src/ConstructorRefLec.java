
class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String r)
	{
		this.name = r.toUpperCase();
	}
	
	public Student(String r, int x)
	{
		System.out.println("this dynamically gets printed");
		this.name = r + x;
	}
	
	public Student() 
	{
		this.name = "heybroz".indent(25);
	}
	
	
}

@FunctionalInterface
interface a_1{
	Student createStudent(String rt,int r);
}

interface a_3 {
	Student createStudent(String rt);
}

interface a_5 {
	Student createStudent();
}

public class ConstructorRefLec {

	public static void main(String[] args) {
		
		ConstructorRefLec a = new ConstructorRefLec();
		System.out.println(a.returnStudent().getName());
		System.out.println(a.returnStudent2().getName());
		System.out.println(a.returnStudent3().getName());
	    
	}
	
	public Student returnStudent() {
		
		a_1 a_2 = Student::new;
		
		 return a_2.createStudent("baby",10); 
		
		
	}
	
	public Student returnStudent2() {
		a_3 a_4 = Student::new;
		return a_4.createStudent("bozo");
	}
	
	public Student returnStudent3() {
		a_5 a_7 = Student::new;
		return a_7.createStudent();
	}
}

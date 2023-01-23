import java.util.function.Function;

class Square {
	private int area;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	
}

public class CompositionExample {

	public static void main(String[] args) {
		
		Function<Square,Integer> fun1 = s -> s.getArea();
	    Function<Integer,Double> fun2 = area -> Math.sqrt(area);
	
	    Function<Square,Double> fun3 = fun2.compose(fun1);
	    
	    Square sq = new Square();
	    sq.setArea(81);
	    Double d = fun3.apply(sq);
	    System.out.println(d);
	}
}

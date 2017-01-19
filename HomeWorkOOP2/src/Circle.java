
public class Circle extends Shape {

	Point a;
	Point b;
	
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	


	public Point getA() {
		return a;
	}


	public void setA(Point a) {
		this.a = a;
	}


	public Point getB() {
		return b;
	}


	public void setB(Point b) {
		this.b = b;
	}


	@Override
	public double getArea() {
		double p = getPerimetr();
		double s = (Math.pow(p, 2))/(4*Math.PI);
		return s;
	}
	
	@Override
	double getPerimetr(){
		double p = 2*Math.PI*radius();
		return p;
		
	}
	
	private double radius(){
		double ax = a.getX(); //aX
		double bx = b.getX(); //bX
		double ay = a.getY(); //aY
		double by = b.getY(); //bY
		double r = Math.sqrt((ax-bx)*(ax-bx) +(ay-by)*(ay-by));
		
		return r;
		
	}


	@Override
	public String toString() {
		return "Circle [getArea()=" + getArea() + ", getPerimetr()=" + getPerimetr() + ", radius()=" + radius() + "]";
	}



	
	

}

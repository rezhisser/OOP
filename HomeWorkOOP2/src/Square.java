
public class Square extends Shape{
	
	Point a;
	Point b;
	Point c;
	Point d;
	
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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


	public Point getC() {
		return c;
	}


	public void setC(Point c) {
		this.c = c;
	}


	public Point getD() {
		return d;
	}


	public void setD(Point d) {
		this.d = d;
	}


	private double abSize(){
		double ax = a.getX(); //aX
		double bx = b.getX(); //bX
		double ay = a.getY(); //aY
		double by = b.getY(); //bY
		double ab = Math.sqrt((ax-bx)*(ax-bx) +(ay-by)*(ay-by));
		
		return ab;
		
	}
	private double bcSize(){
		double bx = b.getX(); //bX
		double cx = c.getX(); //cX
		double by = b.getY(); //bY
		double cy = c.getY(); //cY
		double bc = Math.sqrt((bx-cx)*(bx-cx) +(by-cy)*(by-cy));
		
		return bc;
		
	}
	private double cdSize(){
		double cx = c.getX(); //cX
		double dx = d.getX(); //dX
		double cy = c.getY(); //cY
		double dy = d.getY(); //dY
		double cd = Math.sqrt((cx-dx)*(cx-dx) +(cy-dy)*(cy-dy));
		
		return cd;
		
	}
	
	private double daSize(){
		double dx = d.getX(); //dX
		double ax = a.getX(); //aX
		double dy = d.getY(); //dY
		double ay = a.getY(); //aY
		double cd = Math.sqrt((ax-dx)*(ax-dx) +(ay-dy)*(ay-dy));
		
		return cd;
		
	}

	@Override
	public double getArea() {
		double ab = abSize();
		double s = ab*ab;
		return s;
	}

	@Override
	double getPerimetr() {
		double ab = abSize();
		double bc = bcSize();
		double cd = cdSize();
		double da = daSize();
		double p = ab+bc+cd+da;
		
		return p;
	}
	
	public boolean isSquare(){
		double ab = abSize();
		double bc = bcSize();
		double cd = cdSize();
		double da = daSize();
		if ((ab > 0 && bc > 0 && cd > 0 && da > 0) & (ab == bc && bc == cd && cd == da && da == ab)){
			return true;
		}
		else return false;
	}
	
	


	@Override
	public String toString() {
		return "Square [abSize()=" + abSize() + ", bcSize()=" + bcSize() + ", cdSize()=" + cdSize() + ", daSize()="
				+ daSize() + ", getArea()=" + getArea() + ", getPerimetr()=" + getPerimetr() + "]";
	}
	
	

}

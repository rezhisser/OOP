
public class Triangle extends Shape{

	Point a;
	Point b;
	Point c;
	
	

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}



	@Override
	public double getArea() {
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		double pp = getPerimetr()/2;
		double s = Math.sqrt((pp*(pp-ab)*(pp-bc)*(pp-ca)));
		
		return s;
		
		
	}
	@Override
	public double getPerimetr() {
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		double p = ab+bc+ca;
		
		return p;
		
		
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
	private double caSize(){
		double cx = c.getX(); //cX
		double ax = a.getX(); //aX
		double cy = c.getY(); //cY
		double ay = a.getY(); //aY
		double ca = Math.sqrt((cx-ax)*(cx-ax) +(cy-ay)*(cy-ay));
		
		return ca;
		
	}
	public boolean isTriangle (){
		double ab = abSize();
		double bc = bcSize();
		double ca = caSize();
		if (ab<(bc+ca) && bc<(ab+ca) && ca<(ab+bc)){
			return true;
		}
		else return false;
	}



	@Override
	public String toString() {
		return "Triangle [getArea()=" + getArea() + ", abSize()=" + abSize() + ", bcSize()=" + bcSize()
				+ ", caSize()=" + caSize() + "]";
	}
	
}

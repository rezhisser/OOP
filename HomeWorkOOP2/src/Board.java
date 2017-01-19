
public class Board {
	Shape a;
	Shape b;
	Shape c;
	Shape d;
	Shape [] sh = new Shape [4];
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(Shape a, Shape b, Shape c, Shape d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Shape getA() {
		return a;
	}
	public void setA(Shape a) {
		this.a = a;
	}
	public Shape getB() {
		return b;
	}
	public void setB(Shape b) {
		this.b = b;
	}
	public Shape getC() {
		return c;
	}
	public void setC(Shape c) {
		this.c = c;
	}
	public Shape getD() {
		return d;
	}
	public void setD(Shape d) {
		this.d = d;
	}
		
	public void addShape (Shape a){
			
		for (int i = 0; i < sh.length; i++) {
				if(sh[i] != null){
					continue;
				}
				if (isExist(a) == true){
					System.out.println("Такая фигура уже существует");
					break;
				}
				if (sh[i]==null)
					sh[i] = a;
			break;
			}
			if(isFull() == true){
				System.out.println("Нет места. Доска уже полностью заполнена");
			}
		
	}
	
	public void delShape (Shape a){
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())){
				sh[i] = null;
			}
		}
		
	}
	
	public Shape [] viewBoard(){
		return sh;
		
	}
	
	private boolean isFull(){
		boolean b = false;
		for (int i = 0; i < sh.length; i++) {
			if (sh[i] !=null){
				b = true;
			}
			else b = false;
		
	}
		return b;
	}
	
	public boolean isExist(Shape a){
		boolean b = false;
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null && sh[i].getClass().equals(a.getClass())== true){
				b = true;
			}
		}
		return b;
		
	}
	
	public double getAreFull(){
		double AreFull = 0;
		for (int i = 0; i < sh.length; i++) {
			if(sh[i] !=null){
				 AreFull = AreFull + sh[i].getArea(); 
			}
		}
		return AreFull;
		
	}
	
}


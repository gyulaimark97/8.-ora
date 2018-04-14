package Bodies;

public class Cuboid extends Prism {
	private double a;
	private double b;
	
	public Cuboid(int height, double a,double b) {
		super(height);
		this.a=a;
		this.b=b;
	}
	public double getArea() {
		return a*b;
	}
	
	public String toString() {
		return "A side: "+a+ " B side: "+b+" height:"+super.getHeight()+" "; 
	}
	
}

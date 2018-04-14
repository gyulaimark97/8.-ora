package Bodies;

public class Cylinder extends Prism{

	private int radius;
	
	public Cylinder(int height, int radius) {
		super(height);
		this.radius=radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Radius: "+radius+" Height:"+super.getHeight()+" "; 
	}
}

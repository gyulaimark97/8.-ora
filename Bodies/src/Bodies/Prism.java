package Bodies;

public abstract class Prism {
	
	private int height;
	
	public Prism(int height) {
		this.height=height;
	}
	

	public int getHeight() {
		return height;
	}
	public abstract double getArea();
	
	public double getVolume() {
		return height*getArea();
	}
	public boolean hasBiggerVolume(Prism otherPrism) {
		if(this.getVolume()>otherPrism.getVolume())
			return true;
		else
			return false;
	}

}

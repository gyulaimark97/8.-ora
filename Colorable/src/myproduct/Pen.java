package myproduct;
import java.awt.Color;
import Colorable.Colorable;
import Point.Colorpoint;

public class Pen extends Product implements Colorable{
	
	private Color color;
	private String brand;
	
	public Pen(String name,String brand, int price, int tax, Color color) {
		super(name, price, tax);
		this.brand=brand;
		this.color=color;
	}
	
	public String toString() {
		return super.toString()+ " Brand: "+brand+" color: "+color.toString();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public static void setDefaultColor(Colorable colorable) {
		colorable.setColor(defaultColor);
	}

}

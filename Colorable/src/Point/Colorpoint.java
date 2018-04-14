package Point;
import java.awt.Color;
import Colorable.Colorable;

public class Colorpoint extends Point implements Colorable {
	
	private Color color;
	
	public Colorpoint(int x, int y, Color color) {
		super(x,y);
		this.color=color;
	}
	
	public Colorpoint(Color color) {
		super(0,0);
		this.color=color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public String toString() {
		return super.toString()+" color: "+color.toString();
	}
	public static void setDefaultColor(Colorable colorable) {
		colorable.setColor(defaultColor);
	}

}

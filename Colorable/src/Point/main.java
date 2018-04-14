package Point;
import java.awt.Color;

import Colorable.Colorable;

public class main {

	public static void main(String[] args) {
		
		Colorable colorable= new Colorpoint(2,3,Color.blue);
		System.out.println(colorable.toString());
		Colorpoint.setDefaultColor(colorable);
		System.out.println(colorable.toString());
	}

}

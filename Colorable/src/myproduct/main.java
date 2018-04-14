package myproduct;

import java.awt.Color;

import Colorable.Colorable;
import Point.Colorpoint;

public class main {

	public static void main(String[] args) {
		
		Colorable pen= new Pen("toll","gyártó", 100,20,Color.BLACK);
		System.out.println(pen.toString());
		Pen.setDefaultColor(pen);
		System.out.println(pen.toString());
	}
}

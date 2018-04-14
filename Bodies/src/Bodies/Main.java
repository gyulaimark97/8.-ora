package Bodies;

public class Main {

	public static void main(String[] args) {
		
		Cylinder cylinder= new Cylinder(8,4);
		System.out.println(cylinder.toString() + cylinder.getVolume());
		Cuboid cuboid= new Cuboid(3,4,5);
		System.out.println(cuboid.toString()+cuboid.getVolume());
		if(cylinder.hasBiggerVolume(cuboid))
			System.out.println("Cylinder");
		else
			System.out.println("Cuboid");
		

	}

}

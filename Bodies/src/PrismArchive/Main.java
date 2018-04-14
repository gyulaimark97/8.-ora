package PrismArchive;
import Bodies.Cylinder;
import Bodies.Cuboid;


public class Main {

	public static void main(String[] args) {
		
		
		PrismArchive arch= new PrismArchive(5);
		
		
		Cylinder cylinder= new Cylinder(8,4);
		Cylinder cylinder2= new Cylinder(8,4);
		Cuboid cuboid= new Cuboid(2,3,4);
		arch.setPrisms(0, cylinder);
		arch.setPrisms(1, cylinder2);
		arch.setPrisms(2, cuboid);
		

		
		System.out.println("Prisms:");
		for(int i=0;i<arch.getArraySize();i++) {
			if(arch.getPrism(i)!=null) {
			System.out.println(arch.getPrism(i).toString());
				}
			System.out.println("Avarage volume: "+arch.getAvarageArea());
			System.out.println("number of Cylinders: "+arch.numOfCylinders());
			

	}

}
}

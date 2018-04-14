package PrismArchive;
import Bodies.Prism;
import Bodies.Cylinder;

public class PrismArchive {

	private Prism [] prisms;
	
	public PrismArchive(int maxNumberOfPrisms) {
		super();
		prisms=new Prism[maxNumberOfPrisms];
	}

	public void setPrisms(int index, Prism prism ) {
		prisms[index]=prism;
	}
	
	
	public int getArraySize() {
		return prisms.length;
	}
	
	public Prism getPrism(int index) {
		return prisms[index];
	}
	
	
	
	public int getNotEmptyPrisms() {
		int counter=0;
		for(int i=0;i<this.getArraySize();	i++) {
			if(prisms[i]==null) {
				counter++;
			}
		}
		return this.getArraySize()-counter;
	}
	
	
	
	public double getAvarageArea() {
		double avarage=0;
		for(int i=0;i<this.getArraySize();i++) {
			if(prisms[i]!=null) {
			avarage=avarage+prisms[i].getVolume();
			}
		}
		return avarage/this.getNotEmptyPrisms();
	}
	
	
	
	
	public int  numOfCylinders() {
		int counter=0;
		for(int i=0;i<this.getArraySize();	i++) {
			if(prisms[i] instanceof Cylinder) {
				counter++;
			}
		}
		return counter;
	}
	
	
}
	
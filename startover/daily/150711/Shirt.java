public class Shirt extends Frock{
	
	public Shirt(double size, String color, double price){
		super(size, color, price);
	}
	
	public double calcArea(){
		return getSize() * 1.3;
	}
}
public class NotePad extends Computer{
	private double size;
	
	public NotePad(){}

	public NotePad(String cpu, double memory, double disk, double size, double price){
		super(cpu, memory, disk, price);
		this.size = size;
	}
	public void setSize(double size){
		this.size = size;
	}

	public double getSize(){
		return size;
	}
	
	public String getDetails(){
		return super.getDetails() + "£¬³ß´ç£º" + getSize();
	}
	
}
public class Computer{
	private String cpu;
	private double memory;
	private double disk;
	private double price;
	

	public Computer(){
		this.cpu = "Core(TM) i5-4300U";
		this.memory = 4.0;
		this.disk = 800.0;
		this.price = 7800.0;
	}

	public Computer(String cpu, double memory, double disk, double price){
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
		this.price = price;
	}

	public Computer(String cpu){
		this(cpu, 8.0, 300, 9000.0);
	}

	public void setCpu(String cpu){
		this.cpu = cpu;
	}
	
	public String getCpu(){
		return cpu;
	}

	public void setMemory(double memory){
		this.memory = memory;
	}
	
	public double getMemory(){
		return memory;
	}
	
	public void setDisk(double disk){
		this.disk = disk;
	}

	public double getDisk(){
		return disk;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getDetails(){
		return "CPU: " + getCpu() + ", ÄÚ´æ: " + getMemory() + ", Ó²ÅÌ£º" + getDisk() + ", ¼Û¸ñ: " + getPrice();
	}
}
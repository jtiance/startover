public class PC extends Computer{
	private String box;
	
	public PC(){}

	public PC(String box){
		this();
		this.box = box;
	}



	public PC(String cpu, double memory, double disk, String box, double price){
		super(cpu, memory, disk, price);
		this.box = box;
	}

	public void setBox(String box){
		this.box = box;
	}

	public String getBox(){
		return box;
	}

	/*@Override
	public String getDetails(){
	return "CPU: " + getCpu() + ", 内存: " 
		+ getMemory() + ", 硬盘：" + getDisk() + ", 主机：" + getBox();
	}*/

	//用super关键字调用父类被覆盖的方法
	public String getDetails(){
		return super.getDetails() + ", 主机：" + getBox();
	}

}
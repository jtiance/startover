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
	return "CPU: " + getCpu() + ", �ڴ�: " 
		+ getMemory() + ", Ӳ�̣�" + getDisk() + ", ������" + getBox();
	}*/

	//��super�ؼ��ֵ��ø��౻���ǵķ���
	public String getDetails(){
		return super.getDetails() + ", ������" + getBox();
	}

}
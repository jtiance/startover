public class TestFrock{
	public static void main(String[] args){
	
		//��̬����
		Shirt s = new Shirt(32.0, "red", 120.0);
		System.out.println(s.calcArea());
		
		//��̬����
		Frock s2 = new Shirt(28.0, "green", 260.0);
		System.out.println(s2.calcArea());
		
		
		/*Frock f = new Frock("L", "��ɫ", 180.0);
		Frock f2 = new Frock("S", "��ɫ", 29.0);
		Frock f3 = new Frock("XL", "��ɫ", 5.99);
		
		System.out.println(f.getSerialNumber());
		System.out.println(f2.getSerialNumber());
		System.out.println(f3.getSerialNumber());*/
		
		/*System.out.println("��һ�ε���: " + Frock.getNextNum());
		System.out.println("�ڶ��ε���: " + Frock.getNextNum());*/
	}
}
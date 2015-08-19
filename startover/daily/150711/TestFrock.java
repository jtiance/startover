public class TestFrock{
	public static void main(String[] args){
	
		//本态引用
		Shirt s = new Shirt(32.0, "red", 120.0);
		System.out.println(s.calcArea());
		
		//多态引用
		Frock s2 = new Shirt(28.0, "green", 260.0);
		System.out.println(s2.calcArea());
		
		
		/*Frock f = new Frock("L", "红色", 180.0);
		Frock f2 = new Frock("S", "紫色", 29.0);
		Frock f3 = new Frock("XL", "绿色", 5.99);
		
		System.out.println(f.getSerialNumber());
		System.out.println(f2.getSerialNumber());
		System.out.println(f3.getSerialNumber());*/
		
		/*System.out.println("第一次调用: " + Frock.getNextNum());
		System.out.println("第二次调用: " + Frock.getNextNum());*/
	}
}
public class TestStatic{
	
	
	public static void main(String[] args){
		System.out.println("i = " + A.i);
		A a = new A();
	}
}

class A{
	public static int i = 0;
	
	{
		System.out.println("Invoking¶¯Ì¬Óï¾ä¿é");
	}
	
	static{
		System.out.println("Invoking¾²Ì¬Óï¾ä¿é");
	}
}
public class TestStatic{
	
	
	public static void main(String[] args){
		System.out.println("i = " + A.i);
		A a = new A();
	}
}

class A{
	public static int i = 0;
	
	{
		System.out.println("Invoking��̬����");
	}
	
	static{
		System.out.println("Invoking��̬����");
	}
}
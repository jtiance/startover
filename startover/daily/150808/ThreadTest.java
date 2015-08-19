public class ThreadTest{
	public static void main(String[] args){
		ThreadA a = new ThreadA();
		Thread t1 = new Thread(a);
		
		ThreadB b = new ThreadB();
		Thread t2 = new Thread(b);
		
		ThreadC c = new ThreadC();
		Thread t3 = new Thread(c);
		
		t3.start();
		t1.start();
		t2.start();
		
	}
}
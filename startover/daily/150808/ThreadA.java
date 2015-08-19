public class ThreadA implements Runnable{
	@Override
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println((int)(Math.random() * 100));
		}
	}
}
import java.util.*;

class Printer implements Runnable{
	public void run(){
		int num = 0;
		List<Integer> list = new ArrayList<Integer>();
		try{
			for(int i = 0; i < 10; i++){
				num = (int)(Math.random() * 100);
				System.out.println(num);
				list.add(num);
				Thread.sleep((int)(Math.random() * 200));
			}
			
		}catch(InterruptedException e){
			
		}

		try{
			Thread.sleep(30 * 1000);
		}catch(InterruptedException e){
			System.out.println("被动唤醒");
		}
		
		System.out.println("打印集合...");
		for(int i : list){
			System.out.println(i);
		}	
	}
}

public class ThreadTest{
	public static void main(String[] args){
		Printer p = new Printer();
		Thread t = new Thread(p);
		
		t.start();
		
		try{
			Thread.sleep(2 * 1000);
		}catch(InterruptedException e){
			
		}
		
		
		t.interrupt();
		
		
		
	}
}
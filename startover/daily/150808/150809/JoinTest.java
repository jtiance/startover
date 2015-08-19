import java.util.*;

class Printer implements Runnable{
	
	List<Integer> list = null;
	
	public void run(){
		int num = 0;
		list = new ArrayList<Integer>();
		try{
			for(int i = 0; i < 10; i++){
				num = (int)(Math.random() * 100);
				list.add(num);
				Thread.sleep((int)(Math.random() * 200));
			}
			
		}catch(InterruptedException e){
			
		}
		
		System.out.println("打印集合...");
		for(int i : list){
			System.out.println(i);
		}	
	}
}

class Calc implements Runnable{
	private Printer print;
	
	public Calc(Printer print){
		this.print = print;

	}

	public void run(){

		int num = 0;
		for(int i : print.list){
			num += i;
		}
		
		System.out.println("第二个线程计算集合整数和 = " + num);
	}
}

public class JoinTest{
	public static void main(String[] args){
		Printer p = new Printer();
		Thread t = new Thread(p);
		
		Calc c = new Calc(p);
		Thread t2 = new Thread(c);
		
		t.start();
		
		try{
			t.join();
		}catch(InterruptedException e){
			
		}
		
		t2.start();
		
		int num = 0;
		for(int i : p.list){
			num += i;
		}
		
		System.out.println("主线程计算集合整数和 = " + num);

	}
}
import java.io.*;

public class StopThreadTest{
	public static void main(String[] args){
		A a = new A();
		B b = new B(a);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
		
	}
}

class A implements Runnable{
	private boolean flag;
	public void run(){
		while(!flag){
			System.out.println((int)(Math.random() * 100));
		}
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
}

class B implements Runnable{
	private A a;
	public B(A a){
		this.a = a;
	}
	public void run(){
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		try{
			String str = br.readLine();
			
			if(str.equals("Q")){
				a.setFlag(true);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
public class BalanceTest{
	public static void main(String[] args){
		Account a = new Account(1, "ÕÅÈý", 10000);
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}
}

class Account{
	private int id;
	private String name;
	private int balance;
	
	public Account(int id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getBalance(){
		
		return balance;
	}
}

class Thread1 implements Runnable{
	private Account a;
	
	public Thread1(Account a){
		this.a = a;
	}
	
	public void run(){
		int num = 0;
		synchronized(a){
			num = a.getBalance();
			for(int i = 0; i < 40; i++){
			num -= 100;
			System.out.println("Óà¶î = " + num);
			}
			
		}
	}
}

class Thread2 implements Runnable{
	private Account a;
	
	public Thread2(Account a){
		this.a = a;
	}
	
	public void run(){
		int num = 0;
		synchronized(a){
			num = a.getBalance();
			for(int i = 0; i < 40; i++){
				num -= 100;
				System.out.println("Óà¶î = " + num);
			}
			
		}
	}
	
}
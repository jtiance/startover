public class BankTest{
	public static void main(String[] args){
		Account a = new Account();
		
		DrawBalance db = new DrawBalance(a);
		SaveBalance sb = new SaveBalance(a);
		
		Thread t1 = new Thread(db);
		Thread t2 = new Thread(sb);
		
		t1.start();
		t2.start();
		
	}
}

class Account{
	private int id;
	private String name;
	private int balance = 0;
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
}

class DrawBalance implements Runnable{
	private Account a;
	
	public DrawBalance(Account a){
		this.a = a;
	}
	public void run(){
		synchronized(a){
			if(a.getBalance() < 1000){
				try{
					System.out.println(a.getBalance());
					a.wait();
				}catch(InterruptedException e){
					
				}
		}			
			int balance = a.getBalance() - 1000;
			System.out.println("取款后余额为: " + balance);
		}
		
		
	}
}

class SaveBalance implements Runnable{
	private Account a;
	
	public SaveBalance(Account a){
		this.a = a;
	}
	
	public void run(){
		try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
		synchronized(a){
			a.setBalance(1000);
			a.notify();
			System.out.println("Notifying...");
			System.out.println(a.getBalance());
		}
		
	}
}
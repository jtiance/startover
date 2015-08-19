class GetMoney implements Runnable{
	private int num = 10000;
	
	public void run(){
		for(int i = 0; i < 40 ; i++){
			synchronized(this){
				if(num > 0){
					num -=100;
					System.out.println(Thread.currentThread() + " - �˻��л�ʣ" + num + "Ԫ.");
				}
			}
		}
	}
}

public class GetMoneyTest{
	public static void main(String[] args){
		GetMoney gm = new GetMoney();
		Thread t1 = new Thread(gm);
		Thread t2 = new Thread(gm);
		
		t1.start();
		t2.start();
	}
}
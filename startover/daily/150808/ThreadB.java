import java.io.*;

public class ThreadB implements Runnable{
	public void run(){
		File file = new File("./");
		File[] files = file.listFiles();
		long length = 0;
		int flag = 0;
		
		for(File f : files){
			length += f.length();
			flag++;
		}

		System.out.println("�ļ��ܸ���: " + flag);
		System.out.println("�ļ���ռ�ռ�����: " + length);

	}
}
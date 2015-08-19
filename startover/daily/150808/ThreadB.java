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

		System.out.println("文件总个数: " + flag);
		System.out.println("文件所占空间总数: " + length);

	}
}
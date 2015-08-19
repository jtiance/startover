import java.io.*;
import java.text.*;
import java.util.*;

public class ThreadC implements Runnable{
	public void run(){
		File file = new File("./");
		File[] files = file.listFiles();
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		long length = 0;
		for(File f : files){
			Date d = new Date(f.lastModified());
			System.out.println("File Name = " + f.getName() + "\nLastModifiedDate = " + df.format(d));
		}
	}
}
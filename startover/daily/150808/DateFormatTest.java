import java.io.*;
import java.text.*;
import java.util.*;

public class DateFormatTest{
	public static void main(String[] args){
		File file = new File("./");
		File[] fileList = file.listFiles();
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dateStr = "";
		long length = 0;
		String fileName = "";
		String dir = "<Dir>";
		
		for(File f : fileList){
			Date d = new Date(f.lastModified());
			dateStr = df.format(d);
			length = f.length();
			fileName = f.getName();
			
			if(f.isDirectory()){
				System.out.printf("%-20s %8s %,5d %-10s %n", dateStr, dir, length, fileName);
			}else{
				System.out.printf("%-20s %,10d %-10s %n", dateStr, length, fileName);
			}
			
		}

	}
}
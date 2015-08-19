import java.io.*;

public class FileCopy{
	public static void main(String[] args){
		FileReader fr = null;
		FileWriter fw = null;
		
		char[] buf = new char[100];
		
		try{
			fr = new FileReader("D:/150801/FileCopy.java");
			
			fw = new FileWriter("D:/150801/FileCopy.java.bak");
			
			
			int n = fr.read(buf);
			fw.write(buf, 0, n);
			
			
			
			while(n != -1){
				n = fr.read(buf);
				System.out.println("n = " + n);
				//System.out.println("buf.length = " + buf.length);
				fw.write(buf, 0, n);
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fr != null){
				try{
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
				}
				
			}
			if(fw != null){
				try{
					fw.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	
	}
}
import java.io.*;

public class TestBufferedWriter{
	public static void main(String[] args){
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter("D:/150801/TestBufferedWriter.java.bak");
			bw = new BufferedWriter(fw);
			
		}catch(Exception e){
			
		}
	}
}
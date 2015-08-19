import java.io.*;

public class TestBufferedReader{
	public static void main(String[] args){
		FileReader fr = null;
		BufferedReader br = null;
		int lineNumber = 0;
		
		try{
			fr = new FileReader("D:/150801/TestBufferedReader.java");
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null){
				System.out.println((++lineNumber) + line);
				line = br.readLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if(fr != null){
				try{
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
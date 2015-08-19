import java.io.*;
public class TextFile{
	public static void main(String[] args){
		FileReader fr = null;
		int lineNumber = 1;
		
		try{
			fr = new FileReader("D:/150801/TextFile.java");
			
			char[] buf = new char[100];
			int n = fr.read(buf);
			System.out.print(lineNumber);
			while(n != -1){
				for(int i = 0; i < n; i++){
					System.out.print(buf[i]);
					if(buf[i] == '\n'){
						System.out.print(++lineNumber);
					}
				}
				n = fr.read(buf);
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
		}
	}
}
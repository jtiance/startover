import java.io.*;

public class TestFileIOStream{
	public static void main(String[] args){
		String filePath = "D:/150801/test.dat";
		int[] num = new int[100];
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			
			for(int i = 0; i < num.length; i++){
				oos.writeInt((int)(Math.random() * 100));
			}
			
			oos.flush();
			fos.flush();
			
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			if(oos != null){
				try{
					oos.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
			if(fos != null){
				try{
					fos.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			
			for(int i = 0; i < num.length; i++){
				System.out.print(ois.readInt() + "  ");
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			if(ois != null){
				try{
					ois.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
			if(fis != null){
				try{
					fis.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}
}
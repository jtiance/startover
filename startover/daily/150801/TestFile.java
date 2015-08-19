import java.io.*;

public class TestFile{
	public static void main(String[] args){
		File f = new File("./newDir");
		if(!(f.exists())){
			f.mkdir();
		}
		
		String[] fileList = (new File("./")).list();
		
		for(String s: fileList){
			System.out.println(s);
		}
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter("./newDir/info.txt");
			bw = new BufferedWriter(fw);
			
			for(String s: fileList){
				bw.write(s);
				bw.newLine();
			}
			
			bw.flush();
			fw.flush();
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(bw != null){
				try{
					bw.close();
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
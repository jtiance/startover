import java.io.*;

public class InputTest{
	public static void main(String[] args){
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			fw = new FileWriter("./info.txt");
			bw = new BufferedWriter(fw);
			
			String line = br.readLine();
			int i = 1;
			while(line != null){
				try{
					Integer.parseInt(line);
					if(i > 10){
						break;
					}
					i++;
				
					bw.write(line);
					bw.newLine();
					
					
					bw.flush();
					fw.flush();
				}catch(NumberFormatException e){
					System.out.println("Invalid Input");
				}
				line = br.readLine();
			}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(isr != null){
				try{
					isr.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(is != null){
				try{
					is.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(bw != null){
				try{
					bw.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(fw != null){
				try{
					fw.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
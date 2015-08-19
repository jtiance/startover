import java.util.*;
import java.io.*;

public class ScannerTest{
	public static void main(String[] args){
		File file = new File("./info.txt");
		Scanner scan = null;
		
		List<Integer> list = new ArrayList<Integer>();
		
		try{
			scan = new Scanner(file);
			while(scan.hasNext()){
				int n = scan.nextInt();
				list.add(n);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally{
			scan.close();
		}
		
		for(Integer n : list){
			System.out.println(n);
		}
	}
}
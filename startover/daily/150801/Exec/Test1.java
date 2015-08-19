import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test1{
	public static void main(String[] args){
		Person p1 = new Person("张三", 32, 65.5);
		Person p2 = new Person("李四", 22, 80.0);
		Person p3 = new Person("王五", 5, 35.0);
		
		Person[] p = {p1, p2, p3};
		
		List<Person> perList = new ArrayList<Person>();
		perList.add(p1);
		perList.add(p2);
		perList.add(p3);
		
		String filePath = "D:/150801/Exec/seriObj.txt";
		String filePath2 = "D:/150801/Exec/arrayiObj.txt";
		String filePath3 = "D:/150801/Exec/listiObj.txt";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileOutputStream fos1 = null;
		ObjectOutputStream oos1 = null;
		
		FileOutputStream fos2 = null;
		ObjectOutputStream oos2 = null;
		
		try{
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			oos.flush();
			fos.flush();
			
			fos1 = new FileOutputStream(filePath2);
			oos1 = new ObjectOutputStream(fos1);
			
			oos1.writeObject(p);
			
			oos1.flush();
			fos1.flush();
			
			fos2 = new FileOutputStream(filePath3);
			oos2 = new ObjectOutputStream(fos2);
			
			oos2.writeObject(perList);
			
			oos2.flush();
			fos2.flush();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(oos != null){
				try{
					oos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(fos != null){
				try{
					fos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
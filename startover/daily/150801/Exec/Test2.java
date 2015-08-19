import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test2{
	public static void main(String[] args){
		String filePath = "D:/150801/Exec/seriObj.txt";
		String filePath2 = "D:/150801/Exec/arrayiObj.txt";
		String filePath3 = "D:/150801/Exec/listiObj.txt";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		FileInputStream fis1 = null;
		ObjectInputStream ois1 = null;
		
		FileInputStream fis2 = null;
		ObjectInputStream ois2 = null;
		
		try{
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			Person p3 = (Person) ois.readObject();
			
			System.out.println(p1.getName() + ", " + p1.getAge() + ", " + p1.getWeight());
			System.out.println(p2.getName() + ", " + p2.getAge() + ", " + p2.getWeight());
			System.out.println(p3.getName() + ", " + p3.getAge() + ", " + p3.getWeight());
			
			System.out.println("=========== Array =============");
			
			fis1 = new FileInputStream(filePath2);
			ois1 = new ObjectInputStream(fis1);
			
			Person[] p = (Person[]) ois1.readObject();
			for(Person per : p){
				System.out.println(per.getName() + ", " + per.getAge() + ", " + per.getWeight());
			}
			
			System.out.println("=========== List =============");
			
			fis2 = new FileInputStream(filePath3);
			ois2 = new ObjectInputStream(fis2);
			
			@SuppressWarnings("unchecked")
			List<Person> list = (List<Person>) ois2.readObject();
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i).getName() + ", " + list.get(i).getAge() + ", " + list.get(i).getWeight());
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(ois != null){
				try{
					ois.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(fis != null){
				try{
					fis.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
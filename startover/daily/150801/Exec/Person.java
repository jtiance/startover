public class Person implements java.io.Serializable{
	private String name;
	private int age;
	private double weight;
	
	public Person(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
}
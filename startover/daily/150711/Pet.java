public abstract class Pet{
	private String name;
	private int age;
	private int weight;
	
	public Pet(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		return "名字是: " + getName() + ", 年龄: " + getAge() + "岁, 重量: " + getWeight() + "斤.";
	}
}
public class Person{

	private String name;
	private int age;

	public Person(){
	
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String say(){
		return "我的名字叫" + name + "，今年" + age + "岁.";
	}
}
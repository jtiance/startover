public class Test2{
	public static void main(String[] args){
		Person p = new Person("Leslie", 28);
		Student s = new Student("Alex", 29, 10010, 85.0);

		System.out.println(p.say());
		System.out.println(s.say());
	}
} 
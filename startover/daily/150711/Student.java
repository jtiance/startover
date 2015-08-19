public class Student extends Person{
	private int id;
	private double score;
	private Computer computer;

	public Student(String name, int age, int id, double score, Computer computer){
		super(name, age);
		this.id = id;
		this.score = score;
		this.computer = computer;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setScore(double score){
		this.score = score;
	}
	
	public double getScore(){
		return score;
	}
	
	public void setComputer(Computer computer){
		this.computer = computer;
	}
	
	public Computer getComputer(){
		return computer;
	}

	public String say(){
		return super.say() + "学号是：" + id + "，成绩为：" + score + ". 使用的电脑为: " + computer.getDetails();
	}
}
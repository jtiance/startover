enum Week{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class TestEnumWeek{
	public static void printWeek(Week week){
		switch(week){
			case Monday:
				System.out.println("星期一");
				break;
			case Tuesday:
				System.out.println("星期二");
				break;
			case Wednesday:
				System.out.println("星期三");
				break;
			case Thursday:
				System.out.println("星期四");
				break;
			case Friday:
				System.out.println("星期五");
				break;
			case Saturday:
				System.out.println("星期六");
				break;
			case Sunday:
				System.out.println("星期日");
				break;
		}
	}
	public static void main(String[] args){
		int day = Integer.parseInt(args[0]);
		
		Week[] dayArr = Week.values();
		
		Week w = dayArr[day - 1];
		System.out.println(w);
		printWeek(w);
		
		
	}
}
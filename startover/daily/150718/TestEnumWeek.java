enum Week{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class TestEnumWeek{
	public static void printWeek(Week week){
		switch(week){
			case Monday:
				System.out.println("����һ");
				break;
			case Tuesday:
				System.out.println("���ڶ�");
				break;
			case Wednesday:
				System.out.println("������");
				break;
			case Thursday:
				System.out.println("������");
				break;
			case Friday:
				System.out.println("������");
				break;
			case Saturday:
				System.out.println("������");
				break;
			case Sunday:
				System.out.println("������");
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
class IlleagalNumberException extends Exception {
	public IlleagalNumberException() {

	}

	public IlleagalNumberException(String mgs) {
		super(mgs);
	}
}

public class TestException {

	public static int divide(int m, int n) throws IlleagalNumberException {
		/*
		 * if(n == 0){ throw new IlleagalNumberException("不能被0整除"); }
		 * 
		 * return m / n;
		 */

		int result = 0;

		try {
			result = m / n;
		} catch (ArithmeticException e) {
			throw new IlleagalNumberException("不能被0整除");
		}
		return result;
	}

	public static void main(String[] args) {
		try {
			int num = divide(10, 0);
			System.out.println("Result = " + num);
		} catch (IlleagalNumberException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * int num = 0; try{ int n1 = Integer.parseInt(args[0]); int n2 =
		 * Integer.parseInt(args[1]); num = n1 / n2; }catch(ArithmeticException
		 * e){ System.out.println(e.getMessage());
		 * System.out.println("不能被0整除!"); }catch(NumberFormatException e){
		 * //e.printStackTrace(); System.out.println(e.getMessage());
		 * System.out.println("输入格式错误"); }catch(ArrayIndexOutOfBoundsException
		 * e){ System.out.println("数组越界"); System.out.println(e.getMessage()); }
		 * 
		 * System.out.println("Result = " + num);
		 */

	}
}
/**
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * TestException.divide(TestException.java:3) at
 * TestException.main(TestException.java:9)
 */

/**
 * Exception in thread "main" java.lang.NumberFormatException: For input string:
 * "u" at
 * java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 * at java.lang.Integer.parseInt(Integer.java:492) at
 * java.lang.Integer.parseInt(Integer.java:527) at
 * TestException.main(TestException.java:7)
 */

/**
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 at
 * TestException.main(TestException.java:16)
 */
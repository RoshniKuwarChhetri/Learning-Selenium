package practice;

public class PracticeException {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
//		catch(ArithmeticException e) {
//			System.out.println("can't  divide by 0");
//		}
		catch(RuntimeException e) {
		System.out.println("runtime exception occured");	
		}catch(ArithmeticException e) {
			System.out.println("cant  divide by 0");
		
	}
  }
}

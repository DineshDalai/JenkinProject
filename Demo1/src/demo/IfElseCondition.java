package demo;

public class IfElseCondition {

	public static void main(String[] args) {
		
		String a= "sun day";
		
		switch(a) {
		
		case "monday":
			System.out.println("abc1");
			break;
		
		case "Tuesday":
			System.out.println("abc2");
			break;
			
		case "thur day":
			System.out.println("abc3");
			break;
		
		case "fri day":
			System.out.println("abcd");
			break;
			
		case "sat day":
		System.out.println("Sat day");
		break;
		
		case "sun day":
		System.out.println("sunday print");
		break;
			default:
				System.out.println("invalid number");
		}
	}

}

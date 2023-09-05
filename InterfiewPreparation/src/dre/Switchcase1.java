package dre;

public class Switchcase1 {

	public static void main(String[] args) {


		int i=23;
		int a=5,b=9;
		
		switch(i) {
		
		case 1:i=a+b;
		System.out.println(i);
		break;
		
		case 2:i=a-b;
		System.out.println(i);
		break;
		
		case 3:i=a*b;
		System.out.println(i);
		break;
		default:
			System.out.println("invalid");
		}

	}

}

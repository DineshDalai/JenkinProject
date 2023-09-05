package dre;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		
        //Method 1
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a =" + a);
		System.out.println("b =" + b);

		// method 2
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		//Method 3
		int x=0;
		x=a;
		a=b;
		b=x;
		
		System.out.println("After swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		//Method 4
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		//Method 5
		b=a+b-(a=b);
         
		System.out.println("After swaping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
	}

}

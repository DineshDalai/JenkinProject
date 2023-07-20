package demo;

abstract class A1{
	
	// abstract A1(){   //Remove invalid modifier   //compile time error
		
		 A1(){
		System.out.println("A1 constructor");
	}
}

class AB1 extends A1{
	AB1(){
		
		System.out.println("AB1 constructor");
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		//A1 obj = new A1();  //compile time error
		
		AB1 obj = new AB1();
	
	}

}

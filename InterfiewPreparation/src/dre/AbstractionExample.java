package dre;

abstract class X{
	
	//abstract	int a = 10;   //We can't declear a variable is abstract
	
	public abstract void m1();
	
	public abstract void m2();
	
	public abstract void  m3();
	
	public void m4() {
		System.out.println("m4 method");
		
	}
}

class Y extends X{     //You must declear all the abstract method inside the child class otherwise it will give error


	public void m1() {
		System.out.println("m1 method");
		
	}

	
	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}
	
}
public class AbstractionExample {

	public static void main(String[] args) {
		
		Y obj = new Y();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();

	}

}

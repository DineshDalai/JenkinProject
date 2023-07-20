package demo;

interface I{
	 void m1();
	void m2();
	public static void m3() {
		System.out.println("static method");
	}
	
	public default void m4() {
		System.out.println("default method");
	}
}


class xyz implements I{

	 public void m1() {
		System.out.println("m1 method");
		
	}

	public void m2() {
		System.out.println("m2 method");
		
	}
}
	public class Test123 {
	public static void main(String[] args) {
		xyz obj = new xyz();
			obj.m1();
			obj.m2();
			//m3();
			obj.m4();
			
			
		}
	}

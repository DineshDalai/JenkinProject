package dre;

class Abc {

	int a = 10;
}

class B1 extends Abc {
	int a = 20;

	void m2() {
		System.out.println(a); // 20
		System.out.println(super.a); // 10

	}
}

class C extends B1 {
	int a = 30;

	void m1() {
		System.out.println(a); // 30
		
		System.out.println(super.a);   //20

		  Abc obj1 = new Abc(); 
		  System.out.println(obj1.a);   //10
		 
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {

		C obj = new C();
		obj.m1();
	}
}

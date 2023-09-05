package dre;

public class StaticMethod {

public static int a=10;	
	public static void m1() {
		System.out.println("static methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
System.out.println(a);
StaticMethod.m1();
System.out.println(StaticMethod.a);
	}

}

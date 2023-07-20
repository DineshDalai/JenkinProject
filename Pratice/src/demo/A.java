package demo;

public class A {

public static int a=10;	
	public static void m1() {
		System.out.println("static methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
System.out.println(a);
A.m1();
System.out.println(A.a);
	}

}

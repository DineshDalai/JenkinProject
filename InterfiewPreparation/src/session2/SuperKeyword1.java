package session2;

	public class SuperKeyword1 {	
	public static void main(String[] args) {
		A obj1=new A();
		obj1.m1();		
	}}

	class A{
		int a=10;
	void m1() {
		int a=90;
		
		System.out.println("hi");
	}}
	class B extends A {
		
		int a=20;
		 void display() {
			System.out.println(a);//20
			System.out.println(super.a);//10
		 }
			void show(int c) {
				int d=30;
				System.out.println(d);
			}
			void m1() {
				System.out.println("hi sir");
			}}
	class C extends B{
		 
		String s="Hello boys";
		void m2() {
			System.out.println(s);
		}
		void show() {
			super.m1();
			System.out.println("dinesh");
		}}
	


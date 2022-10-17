package session2;

public class Cons {
String name;
int age;
double salary;
Cons(String name,int age,double salary){
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
}
	
	public static void main(String[] args) {
		Cons obj=new Cons("dinesh",45,29.4);
		Cons obj1=new Cons("dinesh1",55,89.4);
		Cons obj2=new Cons("dinesh2",65,56.3);
		Cons obj3=new Cons("dinesh3",75,89.0);
	}

}
/*
 * class ABC{ public void doctor1() { String name="dinesh"; int age =45; }
 * public void doctor2() { String name="dinesh12"; int age =55; } public void
 * doctor3() { String name="dinesh123"; int age =65; } }
 */

package palle;

public class ConstructorExample1 {

	public String name;
	public int age;
	
	public ConstructorExample1(String n,int a) {
		name = n;
		age = a;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		ConstructorExample1 d=new ConstructorExample1("Dr.pitika",45);
		ConstructorExample1 d1= new ConstructorExample1("Dr.proton",55);

	}

}

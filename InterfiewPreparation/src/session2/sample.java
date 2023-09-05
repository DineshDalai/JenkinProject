package session2;

public class sample {

	sample(){
		System.out.println("Welcome");
	}
	public void m1() {
		System.out.println("dinesh");
	}
	public void m2() {
		System.out.println("m2 method");
	}
	sample(int a){
		this();
		m2();
		m1();
		System.out.println("Hi");
		
	}
	public static void main(String[] args) {
		
sample obj=new sample(4);

	}

}

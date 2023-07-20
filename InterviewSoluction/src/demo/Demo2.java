package demo;

public class Demo2 {
	
public	void m1(Object a) {
	System.out.println("m1 Object");
	}

	public void m1(String i) {
		System.out.println("m1 String");
		
	}

	public void m1(int k) {
		System.out.println("m1 integer");
		
	}
	
	public void m1(char c) {
		System.out.println("m1 character");
		
	}
	public static void main(String[] args) {
		
          Demo2 obj =new Demo2();
     obj.m1(obj);
     obj.m1(null);
     obj.m1(0);
     obj.m1(' ');
	}

}

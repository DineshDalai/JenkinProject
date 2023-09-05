package session2;

public class DefineConstructor {

	 DefineConstructor(){
		
		 int a=10;
		 int b=20;
		 int sum = a+b;
		 System.out.println(sum);
	}
	 
	 public void m1() {
		 System.out.println("Complete");
	 }
	public static void main(String[] args) {
		
		DefineConstructor obj= new DefineConstructor();
obj.m1();
	}

}

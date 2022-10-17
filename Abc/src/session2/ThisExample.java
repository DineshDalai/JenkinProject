package session2;

public class ThisExample {
int a=90;

ThisExample(int a){
	
    this.a=a;
	
}


public void  show() {
	System.out.println(a);
}
	public static void main(String[] args) {
		
		ThisExample obj=new ThisExample(189);
		obj.show();

	}

}

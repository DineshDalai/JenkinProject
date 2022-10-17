package session2;

public class Base {

	public Base() {
		System.out.println("Base calss consturctor");
	}
}
class Der extends Base{
	
	Der(){
		System.out.println("der constructor");
	}

	
	public static void main(String[] args) {
		Der d=new Der();
	}

}

package dre;

public class While {

	public static void main(String[] args) {
		
		int a=20;
		
		while(a>0) {
			if(a%20==0) {
				System.out.println("bigger");
				break;
			}else {
				System.out.println("smaller");
				break;
			}
		}

	}

}

package dre;

public class StringNotEqual {

	public static void main(String[] args) {


		String s="Dinesh";
		//String s1="Dinesh";
		String s1=new String("Dinesh");//String s1="dinesh";
		
		//if(s==s1) {
		if(s.equals(s1)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}

	}

}

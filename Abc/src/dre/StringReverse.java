package dre;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Automation Testing";
		
		char  c[]  = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}

}

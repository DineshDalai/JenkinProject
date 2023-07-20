package dre;

public class StringReverse1 {

	public static void main(String[] args) {
		
		String s = "Automation Testing";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char c = s.charAt(i);
			System.out.print(c);
		}

	}

}

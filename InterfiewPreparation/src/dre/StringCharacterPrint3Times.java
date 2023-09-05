package dre;

public class StringCharacterPrint3Times {

	public static void main(String[] args) {
		
		String s="Dinesh";
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=1;j<=3;j++) {
				char c=s.charAt(i);
				System.out.print(c);
			}
		}
	}

}

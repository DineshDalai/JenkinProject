package dre;

public class Captilize2ndLetterString {

	public static void main(String[] args) {
		
		String s= "dinesh kumar dalai";
		
		StringBuffer bf = new StringBuffer();
		
		String finalString = null;
		
		char c = s.charAt(1);
		
		String st = bf.append(c).toString();
		 finalString  = st.toUpperCase();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == ' ') {
				char ch = s.charAt(i+2);
			String str = bf.append(ch).toString();
			 finalString  = str.toUpperCase();
	
		}
		
	}
System.out.print(finalString);
	}}

package dre;

public class StringDuplicateCharacter {

	public static void main(String[] args) {
		
		//String s = "Tweet";
		String s="cannopy";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
				char c= s.charAt(i);
				System.out.println(s.charAt(i)+""+s.charAt(i+1)+" = "+count);
				break;
				
			}
		}

	}

}

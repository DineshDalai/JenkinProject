package abc;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="madam";
		
		String s1=null;
		for(int i=s.length()-1;i>=0;i--) {
			
			char c= s.charAt(i);
			
			StringBuffer bf=new StringBuffer();
			
			bf.append(c);
			
			 s1=bf.toString();
			
			System.out.print(s1);
			
		}

		if(s.equalsIgnoreCase(s1)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not a palindrom");
		}
	}

}

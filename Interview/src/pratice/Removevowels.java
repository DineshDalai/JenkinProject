package pratice;

public class Removevowels {

	public static void main(String[] args) {
		
		String s="number equal";
int count=0;

		for(int i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}

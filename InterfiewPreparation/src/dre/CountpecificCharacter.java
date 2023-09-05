package dre;

public class CountpecificCharacter {

	public static void main(String[] args) {


		String s ="Tomorrow";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			if (a=='o') {
				count++;
				for(int j=1;j<=count;j++) {
					System.out.print("$");
				}
				
			}else {
				System.out.print(a);
			}
		}

	}

}

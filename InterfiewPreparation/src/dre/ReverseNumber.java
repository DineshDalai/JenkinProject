package dre;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a=136;
		int sum=0;
		int rev=0;
		while(a>0) {
			
			rev=a%10;//6
			sum=(sum*10)+rev;
			a=a/10;
		}

		System.out.println(sum);
	}

}

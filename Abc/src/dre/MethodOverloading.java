package dre;

public class MethodOverloading {

	//Both are local and b is static variable
		int a=10;
		int c=30;
		char c1=10;
		char h = 20;
		static int b=20;
		 
			static String chinmaya(int a,String b) {
				 String s="java";
				System.out.println(s);
				return s;
				
			 }
			
			static void chinmaya(int f,String y,char t) {
				 String s="Selenium";
				System.out.println(s);
				
			 }
			
	public static void main(String[] args) {
		
chinmaya('k',"fhhgh");// Instread of passing integer value u can pass a character value it capture the Ascii value of k
                           //char c = 39; u can store number instread of character it capture the Ascii value of 39
                       //int a = 'd' u can store character instread of integer value it capture the Ascii value of d

		
		
		
	}

	
}

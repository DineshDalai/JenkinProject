package dre;

public class FindStringIndex {

	public static void main(String[] args) {
		
		
		String s = "Car & bike essentials | Up to 60% off";
		
		System.out.println(s.length());//The Total length is 37
		
		/*
		 * index f--37 
		 * index f--36 
		 * index o--35 
		 * index space -- 34 
		 * index %--33 
		 * index 0--32 index 
		 * 6 --31
		 */
		
		String s1 = s.substring(30, 33);//it will print index 30,31,32
		System.out.println(s1);
		
		System.out.println("Index of "+s.charAt(0));//c
		System.out.println("Index of "+s.charAt(30));//6
		System.out.println("Index of "+s.charAt(31));//0
		System.out.println("Index of "+s.charAt(32));//%
		
	}

}

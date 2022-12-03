package dre;

import java.util.HashSet;
import java.util.Set;

public class StringD {

	public static void main(String[] args) {

		String s = "Dinesh";
		
		String s1 = "Dinesh";
		String s2 = new String("Dinesh");
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
	}

}

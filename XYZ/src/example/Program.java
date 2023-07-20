package example;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		String s = "abcabcd";
		
		Set<Character>  obj = new HashSet<>();

		for(int i=0;i<s.length();i++) {
			
			if(!obj.contains(s.charAt(i))) {
				obj.add(s.charAt(i));
			}
		}System.out.println(obj);
	}

}

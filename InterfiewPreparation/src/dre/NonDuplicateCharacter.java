package dre;

import java.util.HashSet;
import java.util.Set;

public class NonDuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "dinesh kumar dalai";
		
		Set<Character> obj = new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				
				if(!obj.contains(s.charAt(i))) {
					obj.add(s.charAt(i));
				}
			}
		}
System.out.println(obj);
	}

}

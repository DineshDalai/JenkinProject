package dre;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String d="abcabccbadad";
		
Set<Character> obj = new HashSet<Character>();
		
		for(int i=0;i<d.length();i++) {
			for(int j=i+1;j<d.length();j++) {
				
				if(d.charAt(i) == d.charAt(j) && (!obj.contains(d.charAt(i)))) {
					obj.add(d.charAt(i));
					System.out.println("Duplicate character are "+d.charAt(i));
				}
			}
		}
	}
}


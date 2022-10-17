package dre;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {
		Duplicate();
		
	}
	
	public static void Duplicate() {
String s="abcabccba";
		
		Set<Character> obj=new HashSet<Character>();
		StringBuffer bf=new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
		
			if(!obj.contains(c)) {
				obj.add(c);
				bf.append(c);
			}
		}
		System.out.println(bf);
		System.out.println(bf.length());
		
	}
}

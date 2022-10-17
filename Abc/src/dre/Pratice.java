package dre;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pratice {

	public static void main(String[] args) {
		
		String s="abcabccba";
		
		Set<Character> obj=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!obj.contains(c)) {
				obj.add(c);
				
				StringBuffer bf= new StringBuffer();
				bf.append(c);
				System.out.println(bf);	
			
		}
		
	}
	}
}

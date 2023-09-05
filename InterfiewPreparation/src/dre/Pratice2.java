package dre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class Pratice2 {

	public static void main(String[] args) {
		
		String s="Dinesh Kumar Dalai";
		
		char  c[] = s.toCharArray();
		
	
			Set<Character> obj = new HashSet<Character>();
		
			StringBuffer bf = new StringBuffer();
			for(int i=0;i<s.length();i++) {
				char c1 = s.charAt(i);
			if(!obj.contains(c1)) {
				obj.add(c1);
				bf.append(c1);
			}
			
		}
			System.out.println(bf);
			System.out.println(obj);
	}
	
	}



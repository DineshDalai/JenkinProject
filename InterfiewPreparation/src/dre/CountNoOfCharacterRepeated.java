package dre;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountNoOfCharacterRepeated {

	public static void main(String[] args) {
		
		String s = "abcabcd";
		
		HashMap<Character,Integer> obj = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(!obj.containsKey(s.charAt(i))) {
				obj.put(s.charAt(i), 1);
			}
			else {
				obj.put(s.charAt(i), obj.get(s.charAt(i))+1);
			}
		}
System.out.println(obj);
	}

}

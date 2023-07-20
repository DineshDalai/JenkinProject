package dre;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Stringoccurance2 {

	public static void main(String[] args) {
		
		String a ="dinesh kumar dalai";
		

		HashMap<Character,Integer> obj = new LinkedHashMap<>();
		
		for(int i=0;i<a.length();i++) {
			
			if(!obj.containsKey(a.charAt(i))) {
			
				obj.put(a.charAt(i), 1);
			}
			else {
				obj.put(a.charAt(i), obj.get(a.charAt(i))+1);
			}
		}System.out.println(obj);
	}

}

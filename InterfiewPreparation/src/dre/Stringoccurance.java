package dre;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Stringoccurance {

	public static void main(String[] args) {
		
		String s = "Automation Testing";
		
		String s1 = s.toLowerCase();
		HashMap<Character,Integer> obj = new LinkedHashMap<Character,Integer>();
		
		char chararray[] = s1.toCharArray();
		
        for(char c : chararray) {
        
        	if(obj.containsKey(c)) {
        		obj.put(c, obj.get(c)+1);
        		
        		
        	}else {
        		obj.put(c, 1);
        	}
        }
        System.out.println(obj);
	}

}

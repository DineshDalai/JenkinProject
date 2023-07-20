package abc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringProgrram {

	public static void main(String[] args) {
		
		String s = "Dinesh Kumar Dalai";
		
		HashMap<Character,Integer> obj = new LinkedHashMap<Character,Integer>();
		
		char c[] = s.toCharArray();
		
		for(char i:c) {
		if(!obj.containsKey(i)) {
			obj.put(i,1);
		}else {
			
	int a=	obj.get(i);
			obj.put(i, a+1);
		}

}System.out.println(obj);
}}

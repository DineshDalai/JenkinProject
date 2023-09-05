package dre;

public class StringReverseWord {

	public static void main(String[] args) {
		
		String s="Dinesh kumar Dalai";
		
		String reverseString ="";
		String word[] = s.split(" ");
		
		for(String w:word) {
			StringBuilder b=new StringBuilder(w);
			b.reverse();
			reverseString = reverseString+b.toString()+" ";
			
		}
		System.out.println(reverseString);
	}

}

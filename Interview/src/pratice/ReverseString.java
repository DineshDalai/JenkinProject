package pratice;

public class ReverseString {

	public static void main(String[] args) {
		
		String originalStr="Dinesh Dalai";
		
	String words[] = originalStr.split(" ");
		 
		
		
		  for(int i=words.length-1;i>=0;i--) {
			  System.out.print(words[i]+" ");
			  }
		 
	    
	}
}

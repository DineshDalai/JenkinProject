package dre;

public class Occurance {

	public static void main(String[] args) {
		
		String s= "Today is MondaydayDayDAY";
		
		String str = s.toLowerCase();
		int count =0;
	
		for(int  i=0;i<s.length();i++) {
				
				if(str.charAt(i)=='d' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'y') {
					count++;
				
			}
		}

		System.out.println(" Total Nummber of day present in a given string is "+count);
	}

}

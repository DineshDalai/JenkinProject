package pratice;

public class Assignment1 {

	public static void main(String[] args) {
		
		String s1="ABC";
		String s2="BC";
		
		String str=s1+s2;
		
		char c[]= str.toCharArray();
		System.out.println(str);
		//Set<String> s=new Set<String>();
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			char c1=str.charAt(i);
			for(int j=i;j<s1.length();j++) {
				
				char c2=str.charAt(j);
				if(c1==c2) {
					count++;
				
			}
			}
			if(count==1) {
				System.out.println(c1);
			}
		}
		
	}

	}

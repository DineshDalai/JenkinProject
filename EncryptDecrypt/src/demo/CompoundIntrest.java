package demo;

public class CompoundIntrest {

	public static void main(String[] args) {
		
		double principal = 1650000;
		
		double monthdeposit = 42313;
		
		int month = 1;
		
		while(principal>=0) {
			monthdeposit = 42313;
		double a = principal/100*1.2;
		System.out.println(month +" month Total RD amount "+principal+" ra 1.2 interest "+a);//1200

		 monthdeposit = monthdeposit-a;
		 
		System.out.println("42313 ru "+a +" katila pare aau balance rahila "+monthdeposit);
		
		principal = principal-monthdeposit;
		System.out.println(principal);
		month++;
	}
	}
}

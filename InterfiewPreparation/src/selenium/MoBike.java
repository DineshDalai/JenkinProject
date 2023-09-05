package selenium;

public class MoBike {

	int bno;
	int phno;
	String name;
	int days;
	int charge;
	
	public void input(int bno,int phno,String name,int days) {
		
		System.out.println("Bike number is "+bno);
		System.out.println("Customer phone number is "+phno);
		System.out.println("Customer name is "+name);
		System.out.println("No. of days bike taken for rent is "+days);
		int totaldays = days;
		if(days<=5) {
			
			System.out.println("for "+days+" Total rent is "+days*500);
		}
		else if(days>=6 && days<=10) {
			System.out.println("for "+days+" Total rent is "+days*400);
		}
		else if(days>10) {
			
			System.out.println("for "+days+" Total rent is "+days*200);
		}
	}
	
	public void compute() {
		
		input(123,73812,"Dinesh",6);
	}
	public static void main(String[] args) {

		MoBike object = new MoBike();
		object.compute();
	}

}

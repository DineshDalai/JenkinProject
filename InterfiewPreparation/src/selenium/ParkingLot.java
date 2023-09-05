package selenium;

public class ParkingLot {

	int vno ;
	int hours ;
	double bill;
	
	public void input(int vno,int hours) {
		
		 if(hours>=1) {
			
			bill=hours*(3)+(hours-1)*(1.5);
			}
			System.out.println("Total charge is "+bill);		
	}
	
	public void Calculate() {
		input(123,5);
	}
	
	public void Display() {
		
		Calculate();

	}
		
	public static void main(String[] args) {

		ParkingLot obj = new ParkingLot();
		obj.Display();
		

	}

}

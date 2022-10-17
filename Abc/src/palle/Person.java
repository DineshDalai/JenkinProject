package palle;

public class Person {

	public static void main(String[] args) {
		Bank b = new Bank();
		//System.out.println(b.money);
		
		int m=b.getMoney();
		//System.out.println(m);
		b.setMoney(20000);
		
	}

}
class Bank{
	private int money=10000;
	
	public int getMoney() {
		return money;
	}
	
	  public void setMoney(int m) { 
		  money = m; 
		  System.out.println(money);
		  }
	 
}
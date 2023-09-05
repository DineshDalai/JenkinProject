package selenium;

public class BookFair {
	String Bname;
	double price;

	BookFair() {
		Bname = null;
		price = 0.0;
	}

	public void Input(String Bname, double price) {

		System.out.println("Book name is " + Bname);
		System.out.println("price of the book is " + price);

		if (price > 3000) {
			price = (price / 100) * 15;
			System.out.println("After discount book price is " + price);
		} else if (price <= 3000 && price >= 1000) {
			price = (price / 100) * 10;
			System.out.println("After discount book price is " + price);
		} else if (price < 1000) {
			price = (price / 100) * 2;
			System.out.println("After discount book price is " + price);
		}
	}

	public void calculate() {

		Input("Robot", 1000);
	}

	public static void main(String[] args) {

		BookFair object = new BookFair();
		object.Input("Dinesh", 200);
	}
}

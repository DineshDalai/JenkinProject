package demo;

import java.util.Base64;

public class EncryDecry {

	public static void main(String[] args) {
		
		String pasword = "password@$123";
		byte[] psw = Base64.getDecoder().decode(pasword);

		String output = new String(psw);
		
		System.out.println("output");
	}

}

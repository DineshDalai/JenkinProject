package demo;

public class Demo1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		
		String s[] = {"Ram","Shyam","Hari"};
		
		for(int i =0; i<=a.length-1;i++) {
			for(int j=i;j<=i;j++) {
				
				System.out.println(a[i] +"=="+s[j]);
			}
		}

	}

}

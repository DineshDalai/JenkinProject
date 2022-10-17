package arrraySample;

import java.util.Arrays;

public class MaximunAndMinimum {

	public static void main(String[] args) {


		int a[]= {10,45,8,32,78,48,45,2,100};
		Arrays.sort(a);
		
		System.out.println("minimum = "+a[0]);
		System.out.println("maximum = "+a[a.length-1]);
	}

}

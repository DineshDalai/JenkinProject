package arrraySample;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		
		int a[]= {1, 4, 17, 7, 25, 3, 100};

		Arrays.sort(a);
		for(int i=a.length-1;i>3;i--) {
			if(a[i]<=a[i-1]) {
				//System.out.println(a[i]);
			}
			else {
				System.out.println(a[i]);
			}
		}
	}

}

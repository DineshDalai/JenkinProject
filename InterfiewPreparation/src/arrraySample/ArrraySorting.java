package arrraySample;

import java.util.Arrays;

public class ArrraySorting {

	public static void main(String[] args) {
		int a[]= {10,4,23,54,1,22,78};
		String a1[]= {"dinesh","dillip","rama","amit"};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a1);
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	}

}

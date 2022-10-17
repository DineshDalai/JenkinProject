package dre;

import java.util.Arrays;

public class ArrayType {

	public static void main(String[] args) {
		
		
		
		  int a[]= {60,10,20,30,40};
		  
		  System.out.println(a[2]);
		 
System.out.println(a.length);
		  Arrays.sort(a);
		
		  for(int i=0;i<=a.length-1;i++) 
		  { 
			  System.out.println(a[i]);//a[1] 
			  }
		 
		
		/*
		 * for(int i:a) { System.out.println(i); }
		 */
	}

}

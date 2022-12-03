package dre;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pratice2 {

	public static void main(String[] args) {
		
		int a[] = {21,54,11,35,4,18};
		//4,18,21,54,11,35
		for(int i=0;i<2;i++){
			
			int b=a[a.length-1];//18,4
			System.out.println(b);
			System.out.println("new");
			//length=6
			for(int j=a.length-1;j>0;j--) {//5
				a[j] = a[j-1];//5--4,4--35,3---11,2---54,1--21      5--35,4--11,3--54,2--21,1---18
				//System.out.print(a[a.length-1]+" ");
			}
			a[0] = b;//18,21,54,11,35,4  4,18,21,54,11,35
			
		}
		
		  for(int k=0;k<a.length;k++) {
			  System.out.print(a[k]+" "); }
		 
	}
	}



package dre;

import java.util.Arrays;

public class Span {

	public static void main(String[] args) {
		
		int a[]= {10,34,21,45,5};
		int temp=0;
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i] >a[j]) {
						
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
						
						
						//System.out.println(Arrays.sort(a));
					}
				}
				System.out.println(a[i]);
			}
			
			
			
			
		}
	}



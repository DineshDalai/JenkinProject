package arrraySample;

import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {


		int Array[] = {21,54,11,35,4,18};
		//4,18,21,54,11,35
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a index in your choice");
		int index = scn.nextInt();
		for(int j=0;j<index;j++) {
		int a=Array[Array.length-1];//18
		
		for(int i=Array.length-1;i>0;i--) {//5
			
			Array[i] = Array[i-1];//5--4
		}
		Array[0] = a;
		}

		for(int k=0;k<Array.length;k++) {
			System.out.print(Array[k]+" ");
		}
	}

}

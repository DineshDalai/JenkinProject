package dre;

public class RotateArray {

	public static void main(String[] args) {
		
		int Array[] = {21,54,11,35,4,18};
		//4,18,21,54,11,35
		
		int p=2;
		
		  for(int i=0;i<p;i++) {
		  
		int a=Array[Array.length-1];//18
		for(int k=Array.length-1;k>0;k--) {
			Array[k] = Array[k-1];//5---4,4--35,3---11,2--54,1---21
		}//18,21,54,11,35,4
		Array[0] = a;//18
		
		 System.out.println(Array[0]); 
		 System.out.println("New");
		  }
	for(int j=0;j<Array.length;j++) {
		System.out.print(Array[j]+" ");
	}

	}

}

package dre;

public class RotateLeft {

	public static void main(String[] args) {
		
		int Array[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		for(int j=0;j<3;j++) {
		
		//int firstarray[] = {1};
			int firstarray = Array[0]; //1,2,3
		//System.out.println("Arrays are ="+firstarray);
		for(int i=0;i<Array.length-1;i++) {//9
			
			Array[i] = Array[i+1];//2,3,4,5,6,7,8,9,10   3,4,5,6,7,8,9,10,1  4,5,6,7,8,9,10,1,2
			//System.out.println(Array[i]+" ");
		}
    Array[Array.length-1] = firstarray;//9--1, 9--2,9--3
		}//new = 2,3,4,5,6,7,8,9,10,1  3,4,5,6,7,8,9,10,1,2  4,5,6,7,8,9,10,1,2,3
	for(int k=0;k<Array.length;k++) {
		
		
		System.out.print(Array[k]+" ");
	}
	
}
}
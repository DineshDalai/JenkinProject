package dre;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		 int[][] arr = { { 1, 2 }, { 3, 4 } };
		  
	        for (int i = 0; i < 2; i++) //i=2
	            for (int j = 0; j < 2; j++)  //j=2
	                System.out.println("arr[" + i + "][" + j + "] = "
	                                   + arr[i][j]);

	}

}

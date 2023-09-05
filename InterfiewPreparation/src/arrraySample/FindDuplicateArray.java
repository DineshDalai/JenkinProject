package arrraySample;

public class FindDuplicateArray {

	public static void main(String[] args) {
		
		int a[]= {10,45,8,32,78,48,45,2,100};
		
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			//for(int j=1;j<a.length;j++) {
			//if(a[i]==a[j]&& i!=j) { This 2 comment session also one type of solution
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				System.out.println("value = "+a[j]);
			}
		}
		}
	}

}

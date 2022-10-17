package arrraySample;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {2,23,1,43,22,4,19,99};
		int temp = 0;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>=a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			System.out.print(a[i]);
			
			}
		}

	}



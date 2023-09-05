package arrraySample;

public class A {

	public static void main(String[] args) {
		
		int a[]= {10,45,8,32,78,48,45,2,100};
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {//3
				
				if(a[i] >= a[j]) {
					temp = a[i];//10
					a[i] = a[j];//8
					a[j] = temp;//10
					
				}
			}System.out.println(a[i]);
			
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}

}

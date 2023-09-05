package arrraySample;

public class Abc {

	public static void main(String[] args) {
		//0123456
		//1,2,4,7
	int a=0;
	int b=1;
	int sum=0;
	
	sum=a+b;//0+1=1
	System.out.println(sum);
	
	while(sum<45) {
		
		a=b;
		b=sum;
		sum=a+b;
		System.out.println(sum);
	}
		}

	}



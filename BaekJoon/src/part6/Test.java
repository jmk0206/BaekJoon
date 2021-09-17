package part6;

//정수 N개의 합 (15596번)

public class Test {
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}

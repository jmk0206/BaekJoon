package part6.q2;

// 셀프 넘버 (4673번)
public class Main {

	public static void main(String[] args) { // 메인
		
		boolean[] check = new boolean[10001]; // 1부터 10000이므로
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000을 넘는 수는 필요가 없다.
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) { // 함수
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10; // 10을 나우어 첫 째 자리를 없앤다.
		}
		
		return sum;
	}

}

package part7.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합 (11720번)
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.println(sum);

	}

}

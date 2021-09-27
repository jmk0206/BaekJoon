package part7.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상수 (2908번)
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A > B ? A : B);
	}

}

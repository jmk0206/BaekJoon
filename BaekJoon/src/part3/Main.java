package Part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// ������ (2739��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		br.close();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=1; i<10; i++) {
//			sb.append(a).append(' ').append('*').append(' ').append(i);
//			sb.append(' ').append('=').append(' ').append(a*i).append('\n');
//		}
//		
//		System.out.println(sb);
		
		
		// A + B - 3 (10950��)

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		int N = Integer.parseInt(br.readLine());
// 
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
// 
//		for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
//			sb.append('\n');
//		}
// 
//		System.out.println(sb);
		
		
		// �� (8393��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		int s = 0;
// 
//		for( int i = 1 ; i <= N ; i++ ) s+=i;
// 
//		System.out.println(s);


		// ���� A + B (15552��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
// 
//		for (int i = 0; i < N; i++) {		
//			String str = br.readLine();
//			int target = str.indexOf(" ");
//			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
//			sb.append(result+"\n");
//		}
//		
//		br.close();
//		System.out.print(sb);
		
		
		// N ��� (2741��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//        
//		int i = 1;
//		while(i<= N) {
//			System.out.println(i);
//			i++;
//		}	
		
		
		// ���� N (2742��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		
//		int i=N;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}

		
		// A + B - 7 (11021��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int a = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st;
//		for (int i=1; i<=a; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			System.out.println("Case #" + i + ": "
//					+(Integer.parseInt(st.nextToken())
//					+Integer.parseInt(st.nextToken())));
//		}
//		br.close();


		// A + B - 8 (11022��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int C = Integer.parseInt(br.readLine());
//		int A;
//		int B;
//		
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
//		
//		for (int i=1; i<=C; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			A = Integer.parseInt(st.nextToken());
//			B = Integer.parseInt(st.nextToken());
//			
//			sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A+B)).append("\n");
//		}
//		br.close();
//		System.out.println(sb);
		
		
		// �� ��� - 1 (2438��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		
//		for(int i=1; i<=N; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// �� ��� - 2 (2439��)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		
//		for (int i=1; i<=N; i++) {
//			for(int j=1; j<=N-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// X���� ���� �� (10871��)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i=0; i<N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if (value < X)
				sb.append(value).append(" ");
		}
		System.out.println(sb);
	}

}

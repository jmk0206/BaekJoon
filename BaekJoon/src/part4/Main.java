package part4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// ﻿A + B - 5 (10952번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//		
//		while(true) {
//			st = new StringTokenizer(br.readLine(), " ");
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			if(A==0 && B==0) {
//				break;
//			}
//			sb.append((A+B)).append('\n');
//		}
//		System.out.println(sb);
		
		
		//﻿A + B - 4 (10951번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		String str;
// 
//		while( (str=br.readLine()) != null ){
//		    
//			int a = str.charAt(0) - 48;
//			int b = str.charAt(2) - 48;
//			sb.append(a+b).append("\n");
//		
//		}
//		System.out.print(sb);

		
		// 더하기 사이클 (1110번)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
		
		do {
			N = ((N%10)*10) + (((N/10) + (N%10))%10);
			cnt ++;
		} while(copy != N);
		
		System.out.println(cnt);
	}

}

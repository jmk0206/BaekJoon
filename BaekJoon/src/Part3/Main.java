package Part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 구구단 (2739번)
		
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
		
		
		// A + B - 3 (10950번)

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
		
		
		// 합 (8393번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		int s = 0;
// 
//		for( int i = 1 ; i <= N ; i++ ) s+=i;
// 
//		System.out.println(s);


		// 빠른 A + B (15552번)
		
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
		
		
		// N 찍기 (2741번)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
        
		int i = 1;
		while(i<= N) {
			System.out.println(i);
			i++;
		}	
		



	}

}

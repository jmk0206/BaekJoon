package Part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 최소, 최대 (10818번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int index = 0;
//		int[] arr = new int[N];
//		while(st.hasMoreTokens()) {
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(arr[0] + " " + arr[N-1]);
		
		
		// 최댓값 (2562번)
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[9];
//		
//		for(int i=0; i<9; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		int max = 0;
//		int index = 0;
//		
//		int count = 0;
//		
//		for(int value : arr) {
//			count++;
//			if(value > max) {
//				max = value;
//				index = count;
//			}
//		}
//		System.out.println(max);
//		System.out.println(index);
		
		
		// 숫자의 개수 (2577번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[10];
//		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//		
//		String str = String.valueOf(val);
//		
//		for (int i = 0; i < str.length(); i++) {
//			arr[(str.charAt(i) - 48)]++;
//		}
//		
//		for(int v : arr) {
//			System.out.println(v);
//		}
		
		
		// 나머지 (3052번)
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashSet<Integer> h = new HashSet<Integer>();
//		
//		for (int i = 0; i < 10; i++) {
//			h.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		
//		System.out.println(h.size());
		
		
		// 다른 방법 (배열)
		
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}

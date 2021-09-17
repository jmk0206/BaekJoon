package part5;

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
		
//		boolean[] arr = new boolean[42];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		for (int i = 0; i < 10; i++) {
//			arr[Integer.parseInt(br.readLine()) % 42] = true;
//		}
//		
//		int count = 0;
//		for(boolean value : arr) {
//			if(value) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		// 평균 (1546번)

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		double arr[] = new double[Integer.parseInt(br.readLine())];
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = Double.parseDouble(st.nextToken());
//		}
//		
//		double sum = 0;
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length; i++) {
//			sum += ( (arr[i] / arr[arr.length-1])*100 );
//		}
//		System.out.println( sum/arr.length );
		
		
		// OX퀴즈
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		String arr[] = new String[N];
//		
//		for (int i = 0; i < N; i++) {
//			arr[i] = br.readLine();
//		}
//		
//		for (int i = 0; i < N; i++) {
//			int cnt = 0; // 연속횟수
//			int sum = 0; // 누적 합산
//			
//			for (int j = 0; j < arr[i].length(); j++) {
//				if (arr[i].charAt(j) == 'O') {
//					cnt++;
//				} else {
//					cnt = 0;
//				}
//				sum += cnt;
//			}
//			
//			sb.append(sum).append('\n');
//		}
//		System.out.println(sb);
		
		
		// 평균은 넘겠지(4344번)
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력
			
			int student = Integer.parseInt(st.nextToken()); // 학생 수
			arr = new int[student];
			
			double sum = 0; // 성적 누계 합 변수
			
			// 성적 입력 부분
			for(int j=0; j<student; j++) {
				int val = Integer.parseInt(st.nextToken()); // 성적 저상
				arr[j] = val;
				sum += val; // 성적 누적 합
			}
			
			double mean = (sum / student);
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평균 넘는 학생 비율 찾기
			for(int j=0; j<student; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
		
	}

}

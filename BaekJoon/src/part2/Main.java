package Part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 백준 1330번
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str, " ");
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		
//		if(A>B) {
//			System.out.println(">");
//		} else if (A<B) {
//			System.out.println("<");
//		} else if (A==B) {
//			System.out.println("==");
//		}
//		
//		System.out.println((A>B) ? ">" :((A<B) ? "<" : "=="));
		
		
		// 백준 9498번
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int A = Integer.parseInt(br.readLine());
//		
//		if(A>=90) System.out.println("A");
//		else if(A>=80) System.out.println("B");
//		else if(A>=70) System.out.println("C");
//		else if(A>=60) System.out.println("D");
//		else System.out.println("F");
//		
//		System.out.println((A>=90) ? "A" : (A>=80) ? "B" : (A>=70) ? "C" : (A>=60) ? "D" : "F");
		
		// 백준 2753번
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int A = Integer.parseInt(br.readLine());
//		
//		if(A%4==0) {
//			if(A%400==0) System.out.println("1");
//			else if(A%100==0) System.out.println("0");
//			else System.out.println("1");
//		} else System.out.println("0");
//		
//		System.out.println((A%4==0)?((A%400==0)?"1":(A%100==0)?"0":"1"):"0");
		
		
		// 백준 14681번
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(br.readLine());
//		
//		if(a>0&&b>0) System.out.println("1");
//		else if(a<0&&b>0) System.out.println("2");
//		else if(a<0&&b<0) System.out.println("3");
//		else System.out.println("4");
		
		// 백준 2884번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int Hour = Integer.parseInt(st.nextToken());
		int Min = Integer.parseInt(st.nextToken());
		
		if(Min < 45) {
			Hour--;
			Min = 60 - (45 - Min);
			if(Hour < 0) {
				Hour = 23;
			}
			System.out.println(Hour + " " + Min);
		} else {
			System.out.println(Hour + " " + (Min - 45));
		}
	}

}

package part1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		// 2557 (Hello World)
		System.out.println("Hello World!");

		// 10718 | We love kriii
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		// 10171 | 고양이
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		// 10172 | 개
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
		// 1000 | A+B
		
		int a, b;
		Scanner sc = new Scanner(System.in); // import Scanner
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
		
		// 1001 | A-B
		
		int A, B;
	//	Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A-B);
		
		
		// 10998 | AxB
		
		//int A, B;
		//Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*B);
		
		// 1008 | A/B

	//	double A, B;
	//	Scanner sc = new Scanner(System.in);
	//	A = sc.nextDouble();
	//	B = sc.nextDouble();
		System.out.println(A/B);
		
		// 10869 | 사칙연산
		
//		int A, B;
//		Scanner sc = new Scanner(System.in);
//		A = sc.nextInt();
//		B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		
		// 10430 | 나머지
		Scanner in = new Scanner(System.in);
		
	//	int A = in.nextInt();
	//	int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		
		// 2588 | 곱셈
		/*
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String b = s.next();
		s.close();
		
		System.out.println(a*(b.charAt(2) - '0'));
		System.out.println(a*(b.charAt(1) - '0'));
		System.out.println(a*(b.charAt(0) - '0'));
		System.out.println(a*Integer.parseInt(b));
		*/
	}
	
}

package Part1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		// 문제번호 2557 (Hello World)
		System.out.println("Hello World!");

		// 문제번호 10718 | We love kriii
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		// 문제번호 10171 | 고양이
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		// 문제번호 10172 | 개
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		// 문제번호 1000 | A+B
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		int a, b;
		Scanner sc = new Scanner(System.in); // import Scanner
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
		
		// 문제번호 1001 | A-B
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		int A, B;
	//	Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A-B);
		
		// 문제번호 10998 | AxB
		//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
		//int A, B;
		//Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*B);
		
		// 문제번호 1008 | A/B
		// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	//	double A, B;
	//	Scanner sc = new Scanner(System.in);
	//	A = sc.nextDouble();
	//	B = sc.nextDouble();
		System.out.println(A/B);
		
		// 문제번호 10869 | 사칙연산
		// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//		int A, B;
//		Scanner sc = new Scanner(System.in);
//		A = sc.nextInt();
//		B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		
		// 문제번호 10430 | 나머지
		Scanner in = new Scanner(System.in);
		
	//	int A = in.nextInt();
	//	int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		
		// 문제번호 2588 | 곱셈
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

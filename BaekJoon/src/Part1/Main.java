package Part1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		// ������ȣ 2557 (Hello World)
		System.out.println("Hello World!");

		// ������ȣ 10718 | We love kriii
		System.out.println("����ģ�� ��������");
		System.out.println("����ģ�� ��������");
		
		// ������ȣ 10171 | �����
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		// ������ȣ 10172 | ��
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		// ������ȣ 1000 | A+B
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		Scanner sc = new Scanner(System.in); // import Scanner
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
		
		// ������ȣ 1001 | A-B
		// ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		int A, B;
	//	Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A-B);
		
		// ������ȣ 10998 | AxB
		//�� ���� A�� B�� �Է¹��� ����, A��B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//int A, B;
		//Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*B);
		
		// ������ȣ 1008 | A/B
		// �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//	double A, B;
	//	Scanner sc = new Scanner(System.in);
	//	A = sc.nextDouble();
	//	B = sc.nextDouble();
		System.out.println(A/B);
		
		// ������ȣ 10869 | ��Ģ����
		// �� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//		int A, B;
//		Scanner sc = new Scanner(System.in);
//		A = sc.nextInt();
//		B = sc.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		
		// ������ȣ 10430 | ������
		Scanner in = new Scanner(System.in);
		
	//	int A = in.nextInt();
	//	int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		
		// ������ȣ 2588 | ����
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

package part7.q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부 (1157번)
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 갯수는 26개이다.
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++; // 해당 인덱스의 값 1 증가
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); // 대문자 출력을 위해 65를 더해준다.
				
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);

	}

}

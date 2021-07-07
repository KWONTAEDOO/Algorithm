package Beginner_수학2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class JW_1534_10진수를286으로 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("수학2/10진수를.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(B==2) {
			//2진수로 바꾸기.
			String str1 = "";
			while(true) {
				if(N==1) {
					str1 += 1;
					break;
				}
				int a = N % 2;
				N /= 2;
				str1 += a;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = str1.length()-1; i >= 0; i--) {
				sb.append(str1.charAt(i));
			}
			System.out.println(sb);
		}
		else if(B==8) {
			String str1 = "";
			while(true) {
				if(N==0) {
					break;
				}
				int a = N % 8;
				N /= 8;
				str1 += a;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = str1.length()-1; i >= 0; i--) {
				sb.append(str1.charAt(i));
			}
			System.out.println(sb);
		}
		else {
			String str1 = "";
			while(true) {
				if(N==0) {
					break;
				}
				int a = N % 16;
				N /= 16;
				if(a>9) {
					//A=10; B=11,C=12,D=13,E=14,F=15,G=16
					switch(a) {
					case 10 :
						str1 += 'A';
						continue;
					case 11 :
						str1 += 'B';
						continue;
					case 12 :
						str1 += 'C';
						continue;
					case 13 :
						str1 += 'D';
						continue;
					case 14 :
						str1 += 'E';
						continue;
					case 15 :
						str1 += 'F';
						continue;
					}
				}
				str1 += a;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = str1.length()-1; i >= 0; i--) {
				sb.append(str1.charAt(i));
			}
			System.out.println(sb);
		}
	}
}






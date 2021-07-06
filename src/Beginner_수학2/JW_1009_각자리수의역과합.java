package Beginner_수학2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_1009_각자리수의역과합 {
	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input/수학2.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str2;
		while(true) {
			String str = br.readLine();
			str2 = "";
			int sum = 0;
			if(str.equals("0")) break;
			
			else {
				for (int i = str.length()-1; i >= 0; i--) {
					int a = str.charAt(i)-'0';
					
					str2 += str.charAt(i);
					sum+=a;
				}
			}
			
			System.out.println(Integer.parseInt(str2)+" "+sum);
		}
	}
	
}

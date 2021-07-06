package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_1240_제곱근 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("분할정복/제곱근.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		long N = Integer.parseInt(br.readLine());
		
		long ans = 0;
		for (int i = 2; i < N; i++) {
			if(i*i > N) {
				ans = i-1;
				break;
			}
		}
		System.out.println(ans);
	}
}

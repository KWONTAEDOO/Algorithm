package Beginner_수학2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_2814_이진수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("수학2/이진수.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String str = br.readLine();
		
		int n = 1;
		int sum = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			
			int num = str.charAt(i)-'0';
			
			num *= n;
			sum += num;
			n *=2;
		}
		System.out.println(sum);
		
	}
}

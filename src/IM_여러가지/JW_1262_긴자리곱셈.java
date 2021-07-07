package IM_여러가지;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_1262_긴자리곱셈 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("IM여러가지/긴자리곱셈.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			String ans = "";
			String str1 = st.nextToken();
			if(str1.equals("0")) break;
			String str2 = st.nextToken();
			
			//앞에꺼의 뒤에부터 X 뒤에꺼의 뒤에부터 X 하면서 1씩던져주기?
			//곱셈하고 올라온거 저장해둔뒤 마지막에더하기
			if(str1.equals(0)||str2.equals(0)) ans="0";
			
			int length1 = str1.length()-1;
			int length2 = str2.length()-1;
			int past = 0;
			while(true) {
				str1.charAt(length1);
				str2.charAt(length2);
				
			}
			
			
		}
	}

}

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
		
		String str = br.readLine();
		
		long N  = Long.parseLong(str);
		// 범위를 설정, 15같은 경우 정수로써 대입
		// 자릿수의 절반 크기에 해당. 10자리숫자면 이숫자의 제곱근은 다섯자리수
		// 10000 -> 100 , 100000 -> 1000 -> 10000000 ->100000
		// 길이/2  자릿수+1
		// 복습
		
		long length = 0;
		if(str.length()%2==0) {
			length = str.length()/2;
		}
		else {
			length = str.length()/2 + 1;
		}
		
		long low = (long) Math.pow(10, length-1);
		long high = (long)Math.pow(10, length);
		
		long ans = search(low, high, N);
		
		System.out.println(ans);
	}

	private static long search(long low, long high, long n) {
		long mid = 0;
		long max = (long)303700050 * 10 - 1;
		
		if(n==Long.MAX_VALUE) return max;
		
		while(low<=high) {
			mid = (low+high)/2;
			
			if(mid>max) mid = max;
//			System.out.print("mid : "+mid+" ");
//			System.out.println("low : "+ low+" "+ "high : "+high);
			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid>n) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		mid = (low+high)/2;
		return mid;
	}
}

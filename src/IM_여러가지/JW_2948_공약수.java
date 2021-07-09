package IM_여러가지;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_2948_공약수 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("IM여러가지/공약수.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int G = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		//가지고 있는 최대공약수 기반으로
		// A,B(찾아야하는 두 수)  최대 공약수를 G, 최소공배수를 L
		// A = aG, B = bG 
		// L = a*b*G
		// L/G = a*b
		int val = 1;
		int AB = L/G;
		
		for (int i = 2; i*i <= AB; i++) {
			if(AB%i ==0 && euclid(i, AB/i)==1)
				val = i;
		}
		
		System.out.print(G*val +" "+ G*(AB/val));
	}
	
	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	static int L;
	private static int euclid(int a, int b) {
		if(a==0) 
			return b;
		return euclid(b%a, a);
	}
}

package Beginner_수학2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_2811_소수와합성수 {
	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input/수학2.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a==1) System.out.println("number one");
			
			else {
				if(check(a)) {
					System.out.println("prime number");
				}else {
					System.out.println("composite number");
				}
			}
			//1==number one , 2==prime number, 3==composite number
		}
	}

	private static boolean check(int a) {
		int k = (int)Math.sqrt(a); //int로 했으니깐 크거나 같을때까지해줘서 판단해줘야함.
		for (int i = 2; i <= k; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}

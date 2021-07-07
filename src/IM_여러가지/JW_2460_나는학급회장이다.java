package IM_여러가지;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_2460_나는학급회장이다 {
	
	static int[][] count;
	static int max, max_score;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("IM여러가지/나는학급회장이다.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int first_score = 0;
		int second_score = 0;
		int third_score = 0;
		
		count = new int[4][4];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int third = Integer.parseInt(st.nextToken());
			
			first_score += first;
			second_score += second;
			third_score += third;
			
			count[1][first]++;
			count[2][second]++;
			count[3][third]++;
		}
		max = 1;
		max_score = first_score;
		
		//전역변수로 카운트 함수를 선언해두고 score 두개를 넘겨서 비교하자.
		compare(max_score, second_score, 2);
//		System.out.println(max);
		compare(max_score, third_score, 3);
//		System.out.println(count[1][3]+" "+count[3][3]);
		// 비교하는 함수 만들기.  전역변수로넘기자.
		System.out.print(max+" "+max_score);

	}
	
	private static void compare(int max_score2, int second_score, int idx) {
		if(max_score2<second_score) {
			max_score = second_score;
			max = idx;
		}
		else if(max_score2==second_score) {
			boolean flag = false;
			if(max==0) max=1;
			//3 비교
			if(!flag) {
				if(count[idx][3] > count[max][3]) {
					max = idx;
					max_score = second_score;
					flag = true;
					//System.out.println(31);
				}
				//현재께 3이더 큰경우니깐 바뀌면안됌.
				else if(count[idx][3] < count[max][3]) {				
					flag = true;
					//System.out.println(32);
				}
			}
			//2 비교
			if(!flag) {
				if(count[idx][2] > count[max][2]) {
					max = idx;
					max_score = second_score;
					flag = true;
					//System.out.println(21);
				}
				//현재께 3이더 큰경우니깐 바뀌면안됌.
				else if(count[idx][2] < count[max][2]) {				
					flag = true;
				//	System.out.println(22);
				}
			}
			//1 비교
			if(!flag) {
				if(count[idx][1] > count[max][1]) {
					max = idx;
					max_score = second_score;
					flag = true;
					//System.out.println(11);
				}
				//현재께 3이더 큰경우니깐 바뀌면안됌.
				else if(count[idx][1] < count[max][1]) {				
					flag = true;
					//System.out.println(12);
				}
			}
			if(!flag) {
				max=0;
			}
		}
		
	}
}






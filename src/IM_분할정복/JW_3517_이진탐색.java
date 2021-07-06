package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_3517_이진탐색 {
	static int N,Q;
	static int[] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.setIn(new FileInputStream("분할정복/이진탐색.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		map = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		Q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Q; i++) {
			int val = Integer.parseInt(st.nextToken());
			
//			sb.append(find(val, 0, N-1)+" ");
			sb.append(find2(val,0,N-1)+" ");
		}
		
		//찾으려고하는 수를 기준으로 보내서 반씩나눠가며 보내자.
		System.out.println(sb);
	}
	
//	private static int find(int k, int start, int end) {
//		int mid = 0;
//		while(start <= end) {
//			mid = (start+end)/2;
//			if(map[mid]==k) {
//				return mid;
//			}
//			else if(map[mid]>k) {
//				end = mid-1;
//			}
//			else {
//				start = mid+1;
//			}
//		}
//		return -1;
//	}

	private static int find2(int k, int start, int end) {
		if(start>end) {
			return -1;
		}
		//시작점, 끝점 가지고 다니기.
		int mid = (start+end)/2;
		//System.out.print("mid : "+mid+" ");
		//System.out.println(" map[mid] : " + map[mid]+" k : "+ k );
		//같은 경우
		if(map[mid]==k) {
			return mid;
		}
		//작은경우
		else if(map[mid]>k) {
			return find2(k, start, mid-1);
		}
		else {
			return find2(k, mid+1, end);
		}
	}
}




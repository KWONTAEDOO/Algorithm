package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JW_1219_모자이크 {
	
	static class Point implements Comparable<Point>{
		int x,y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "x : "+x+"y: "+y;
		}

		@Override
		public int compareTo(Point o) {
			return this.y - o.y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("분할정복/모자이크.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		//일단 열이 최대가 되는 크기로 확인해본다.
		
		//리스트에 시작점기준으로 사각형둘러싸고 하나씩 키워나가기.
		//색종이를 다안써도되는과정을 생각못했음.
		
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken()); //최대 행
		int c = Integer.parseInt(st.nextToken()); //최대 열
		
		int n = Integer.parseInt(br.readLine()); //색종이 장수.
		
		int wrong = Integer.parseInt(br.readLine()); //잘못칠해진칸의 개수
		
		int[] list = new int[wrong];
		int max_r = 0; //가장 높은 행값 배열의 시작을 위해?(맨 밑에서 시작)
		int max_c = 0; //
		for (int i = 0; i < wrong; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[i] = y;
			max_r = Math.max(max_r, x);
			max_c = Math.max(max_c, y);
		}
		//System.out.println(max_c);
		boolean flag = false;
		Arrays.sort(list);
		int idx = 0;
		int square;
		if(list.length==1) {
			sb.append(1);
			flag = true;
		}
		if(!flag) {
			while(true) {
				int cnt = n-1; //색종이의 수 카운트
				square = max_r + idx; // 사각형 크기 설정
				if(square>max_c) break;
				//System.out.println(square+" "+idx);
				int current_c = list[0] + square; //
				
				for (int i = 1; i < list.length; i++) {
					//현재 칸범위벗어나면 새로운 색종이쓰기.
					if(current_c <= list[i]) {
						current_c = list[i]+square;
						cnt--; //색종이장수 잘라.
						if(cnt<0) {
							break;
						}
					}
					//현재 칸 범위 안에 있다면.
				}
				if(cnt>=0) {
					sb.append(square);
					break;
				}
				else {
					idx++; //사각형크기늘리기.
				}
			}
		}
		System.out.println(sb);
	}
}





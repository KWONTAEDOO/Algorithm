package IM_분할정복;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
		
		//일단 열이 최대가 되는 크기로 확인해본다.
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken()); //최대 행
		int c = Integer.parseInt(st.nextToken()); //최대 열
		
		int n = Integer.parseInt(br.readLine()); //색종이 장수.
		
		int wrong = Integer.parseInt(br.readLine()); //잘못칠해진칸의 개수
		
		List<Point> list = new ArrayList<>();
		
		int max_r = 0; //가장 높은 행값 배열의 시작을 위해?(맨 밑에서 시작)
		for (int i = 0; i < wrong; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new Point(x,y));
			max_r = Math.max(max_r, x);
		}
		
		Collections.sort(list);
		
		int current_c = list.get(0).y+2;
		for (int i = 0; i < list.size(); i++) {
			if(current_c < list.get(i).y) {
				current_c = list.get(i).y;
			}
			
		}
		
	}
}





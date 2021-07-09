package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_1219_모자이크 {
	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("분할정복/모자이크.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//일단 열이 최대가 되는 크기로 확인해본다.
		//리스트에 넣은거 방문처리를 해나간다. 방문했다면 PASS , 겹치는게 가능.
		
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		
		
		
	}
}

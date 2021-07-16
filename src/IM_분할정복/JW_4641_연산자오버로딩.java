package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_4641_연산자오버로딩 {
	static class Rectangle{
		int r;
		int c;
		
		Rectangle(int r, int c){
			this.r = r;
			this.c = c;
		}
		
		boolean operator(Rectangle r) {
			if((this.r*this.c)<(r.r*r.c)) return true;
			else return false;
		}
	}
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("분할정복/연산자오버로딩.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		Rectangle a = new Rectangle(a1, b1);
		
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		Rectangle b = new Rectangle(a2, b2);
		
		if(a.operator(b)) System.out.println("a is smaller");
		else System.out.println("b is smaller");
	}
}

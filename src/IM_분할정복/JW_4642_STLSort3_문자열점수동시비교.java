package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class JW_4642_STLSort3_문자열점수동시비교 {
	//
	static class Student implements Comparable<Student>{
		String name;
		int score;
		
		Student(String name, int score){
			this.name = name;
			this.score = score;
		}
		@Override
		public int compareTo(Student s) {
			if(this.score == s.score)
				return name.compareTo(s.name);
			return s.score - this.score;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("분할정복/SS3.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Student> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			Student s = new Student(name, score);
			list.add(s);
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).name+" "+list.get(i).score+"\n");
		}
		System.out.println(sb);
	}
}

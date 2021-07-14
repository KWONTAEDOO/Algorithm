package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JW_4523_STLSort1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("분할정복/SS1.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] origin = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			origin[i] = arr[i];
		}
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		int[] arr2 = new int[e-s+1];
		int idx = 0;
		for (int i = s; i < e; i++) {
			arr2[idx] = arr[i];
			idx++;
		}
		
		
		StringBuilder sb1 = new StringBuilder();
		Arrays.sort(origin);
		for (int i = 0; i < arr.length; i++) {
			sb1.append(origin[i]+" ");
		}
		
		Arrays.sort(arr2);
		//System.out.println(Arrays.toString(arr2));
		
		idx = 0;
		for (int i = s; i < e+1; i++) {
			arr[i] = arr2[idx];
			idx++;
		}
		
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb2.append(arr[i]+" ");
		}
		System.out.println(sb2);
		System.out.println(sb1);
		
	}
}







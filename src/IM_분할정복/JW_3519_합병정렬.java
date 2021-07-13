package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JW_3519_합병정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("분할정복/합병정렬.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] sel = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		mergeSort(arr,0,N-1,sel);
		
		
	}

	private static void mergeSort(int[] arr, int low, int high, int[] sel) {
		
		//재귀 종료조건
		if(low>=high) return;
		
		// 분할
		int mid = (low+high)/2;
		
		// 정복
		mergeSort(arr, low, mid, sel);
		mergeSort(arr, mid+1, high, sel);
		
		// 결합
		int i = low;
		int j = mid+1;
		for (int k = low; k <= high; k++) {
			if(j>high) {
				sel[k]=arr[i++];
			}
			else if(i>mid) {
				sel[k] = arr[j++];
			}
			else if(arr[i]<=arr[j]) {
				sel[k]=arr[i++];
			}
			else {
				sel[k] = arr[j++];
			}
		}
		for (i = low; i <= high; i++) {
			arr[i] = sel[i];
		}
		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.print(arr[j2]+" ");
		}
		System.out.println();
	}
}




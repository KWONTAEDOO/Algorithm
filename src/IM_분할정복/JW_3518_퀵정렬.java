package IM_분할정복;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_3518_퀵정렬 {
	
	static int[] arr;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("분할정복/퀵정렬.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//첫 번째로 피봇의 위치를 파악하기 위해 분할탐색해줘야한다.
		//맨마지막을 타겟으로 두고 앞에서부터 비교하면서 작으면 앞으로 크면 뒤로 빼주기.
		//작은 숫자의 index를 저장해서 갖고다니기. 큰숫자의 index는 바꾼인덱스부터 +1 씩 넣어주기.
		
		//분할과정
		quickSort(0, N-1);
	}
	
	private static void quickSort(int low, int high) {
		if(low>=high) return;
		int pivot = arr[high];
		int i = low-1;
		
		// 5 2 4 1    pivot = 3 
		for (int j = low; j < high; j++) {
			if(arr[j]<pivot) {
				++i;
				Swap(i,j);
			}
		}
		++i;
		Swap(i,high);
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < arr.length; j++) {
			sb.append(arr[j]+" ");
		}
		System.out.println(sb);
		quickSort(low, i-1);
		quickSort(i+1, high);
	}

	private static void Swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}







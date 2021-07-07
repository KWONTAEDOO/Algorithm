package Beginner_수학2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JW_1534_10진수를286으로 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("수학2/10진수를.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[N];
		// 3점 2점  1점 중 최종점수가 가장많은사람이 회장ㅇ된다. 
		// 배열에 저장해놓고 만약 동점이라면 횟수를 세어주면될듯.
		// 유일한 경우에는 후보의 번호와 최고 점수출력. (3 -> 2-> 1) 순으로 비교
		// 만약세개가 다같다면 0과 최고점수출력
		
		
	}
}






package 순열조합;

import java.util.Arrays;
import java.util.Scanner;

// 중복 가능한 순열 
public class 순열 {
	static int n; // 자연수 1~n까지의 수
	static int m; // m개 숫자 뽑기
	static int[] arr;

	public static void per(int cnt) {
		if (cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[cnt] = i;
			per(cnt + 1);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		per(0);
	}
}

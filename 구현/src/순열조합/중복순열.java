package 순열조합;

import java.util.Arrays;
import java.util.Scanner;

// 중복 없는 순열 
public class 중복순열 {
	static int n; // 자연수 1~n까지의 수
	static int m; // m개 숫자 뽑기
	static int[] arr;
	static boolean[] check;

	public static void per(int cnt) {
		if (cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[cnt] = i;
				per(cnt + 1);
				check[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		check = new boolean[n + 1]; // 인덱스에 해당하는 숫자 체크(idx 0 사용 x)
		per(0);
	}
}

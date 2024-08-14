package 순열조합;

import java.util.Arrays;
import java.util.Scanner;

// 중복 가능한 조합 
public class 조합 {
	static int n; // 자연수 1~n까지의 수
	static int m; // m개 숫자 뽑기
	static int[] arr;

	public static void com(int cnt, int start) {
		if(cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=start; i<=n; i++) {
			arr[cnt] = i;
			com(cnt+1, i);
				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		com(0, 1);
	}

}

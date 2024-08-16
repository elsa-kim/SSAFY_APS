package 알고리즘test;

import java.util.Scanner;

public class 스위치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		int pCnt = sc.nextInt();
		for (int i = 0; i < pCnt; i++) {
			int check = sc.nextInt();
			int n = sc.nextInt();
			if (check == 1) {
				for (int j = 0; j < cnt; j++) {
					if ((j + 1) % n == 0) {
						if (arr[j] == 1) {
							arr[j] = 0;
						} else {
							arr[j] = 1;
						}
					}
				}
			} else {

				int k = 0;
				while (n - 1 - k >= 0 && n - 1 + k < cnt && arr[n - 1 - k] == arr[n - 1 + k]) {
					k++;
				}
				for (int j = 0; j < k; j++) {
					if (arr[n - 1 - j] == 0) {
						arr[n - 1 - j] = 1;
						arr[n - 1 + j] = 1;
					} else {
						arr[n - 1 - j] = 0;
						arr[n - 1 + j] = 0;
					}
				}
			}
		}
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}

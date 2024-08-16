package 알고리즘test;

import java.util.Scanner;

// 미완성
public class 미세먼지안녕 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int T = sc.nextInt();
		int airM = 0;
		int[][] arr = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == -1)
					airM = i;
			}
		}
		for (int t = 0; t < T; t++) {
			int[][] amount = new int[R][C];
			int[][] cnt = new int[R][C];
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (arr[i][j] > 0) {
						amount[i][j] = arr[i][j] / 5;
					}
					if (i - 1 > 0 && arr[i - 1][j] != -1) {
						cnt[i][j]++;
					}
					if (j - 1 > 0 && arr[i][j - 1] != -1) {
						cnt[i][j]++;
					}
					if (j + 1 < C && arr[i][j + 1] != -1) {
						cnt[i][j]++;
					}
					if (i + 1 < R && arr[i + 1][j] != -1) {
						cnt[i][j]++;
					}
				}
			}
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					arr[i][j] = arr[i][j] - amount[i][j] * cnt[i][j];
					if (i + 1 < R && arr[i + 1][j] != -1) {
						arr[i][j] += amount[i + 1][j];
					}
					if (j + 1 < C && arr[i][j + 1] != -1) {
						arr[i][j] += amount[i][j + 1];
					}
					if (i - 1 > 0 && arr[i - 1][j] != -1) {
						arr[i][j] += amount[i - 1][j];
					}
					if (j - 1 > 0 && arr[i][j - 1] != -1) {
						arr[i][j] += amount[i][j - 1];
					}

				}
			}
			int idx = airM - 1;
			idx--;
			while (idx != 0) {
				idx--;
				arr[idx + 1][1] = arr[idx][1];
			}
			idx = airM;
			idx++;
			while (idx != R - 1) {
				idx++;
				arr[idx - 1][1] = arr[idx][1];
			}
			idx = 1;
			while (idx != C) {
				arr[0][idx - 1] = arr[0][idx];
				arr[R - 1][idx - 1] = arr[R - 1][idx];
				idx++;
			}
			idx = 0;
			while (idx != airM - 1) {
				idx++;
				arr[idx - 1][1] = arr[idx][1];
			}
			idx = R - 1;
			while (idx != airM) {
				idx--;
				arr[idx + 1][1] = arr[idx][1];
			}
			idx = C - 1;
			while (idx != 1) {
				arr[airM - 1][idx] = arr[airM - 1][idx - 1];
				arr[airM][idx] = arr[airM][idx - 1];
				idx--;
			}
			arr[airM - 1][1] = 0;
			arr[airM][1] = 0;

		}
		int sum = 2;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);

	}
}

package 알고리즘TEST;

import java.util.Scanner;

public class 햄버거_다이어트 {
	static boolean[] check;
	static int[][] origin;
	static int maxC;
	static int maxT;
	static int[] res;
	static int size;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb;
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			sb = new StringBuffer();
			size = sc.nextInt();
			maxC = sc.nextInt(); // 최대 칼로리
			maxT = 0; // 최대 맛
			check = new boolean[size];
			origin = new int[size][2];
			for (int i = 0; i < size; i++) {
				origin[i][0] = sc.nextInt();
				origin[i][1] = sc.nextInt();
			}
			for (int i = 1; i < size; i++) {
				res = new int[i];
				com(0, 0);

			}
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			sb.append(maxT);
			System.out.println(sb);
		}
	}

	private static void com(int cnt, int start) {

		if (cnt == res.length) {
			int sum = 0;
			for (int idx : res) {
				sum += origin[idx][1];
			}
			if (sum > maxC) {
				return;
			} else {
				int sumT = 0;
				for (int idx : res) {
					sumT += origin[idx][0];
				}
				if (sumT > maxT)
					maxT = sumT;
			}
			return;
		}

		for (int i = start; i < size; i++) {
			if (!check[i]) {
				check[i] = true;
				res[cnt] = i;
				com(cnt + 1, start + 1);
				check[i] = false;
			}
		}
	}
}

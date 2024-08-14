package SWEA_1232_사칙연산;

import java.util.Scanner;

public class Solution {
	static int cnt;
	static String[] arr;
	static int[][] line;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			cnt = sc.nextInt();
			arr = new String[cnt + 1];
			line = new int[cnt + 1][];
			for (int i = 0; i < cnt; i++) {
				int idx = sc.nextInt();
				String txt = sc.next();
				arr[idx] = txt;
				if (txt.charAt(0) - '0' >= 0 && txt.charAt(0) - '0' <= 9)
					continue;
				line[idx] = new int[2];
				line[idx][0] = sc.nextInt();
				line[idx][1] = sc.nextInt();
			}
			System.out.println("#" + tc + " " + dfs(1));
		}
	}

	private static int dfs(int i) {
		int a;
		int b;
		if (line[line[i][0]] != null) {
			a = dfs(line[i][0]);
		} else {
			a = Integer.parseInt(arr[line[i][0]]);
		}
		if (line[line[i][1]] != null) {
			b = dfs(line[i][1]);
		} else {
			b = Integer.parseInt(arr[line[i][1]]);
		}
		if (arr[i].equals("+")) {
			return a + b;
		} else if (arr[i].equals("-")) {
			return a - b;
		} else if (arr[i].equals("*")) {
			return a * b;
		} else {
			return a / b;
		}
	}

}
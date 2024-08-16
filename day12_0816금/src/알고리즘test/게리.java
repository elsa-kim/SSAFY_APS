package 알고리즘test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 게리 {
	static int count;
	static int[] origin;
	static int[] res;
	static boolean[] check;
	static int min;
	static int[][] lineInfo;
	static boolean canDiv;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		canDiv = false;
		min = 10000;
		origin = new int[count];
		for (int i = 0; i < count; i++) {
			origin[i] = sc.nextInt();
		}
		lineInfo = new int[count][];
		for (int i = 0; i < count; i++) {
			lineInfo[i] = new int[sc.nextInt()];
			for (int j = 0; j < lineInfo[i].length; j++) {
				lineInfo[i][j] = sc.nextInt();
				lineInfo[i][j]--;
			}
		}
		check = new boolean[count];
		for (int i = 1; i <= count / 2; i++) {
			res = new int[i];
			com(0, 0);
		}
		System.out.println(canDiv ? min : -1);
	}

	private static void com(int cnt, int start) {
		if (cnt == res.length) {
			int[] other = new int[count - res.length];
			next: for (int i = 0, idx = 0; i < count; i++) {
				for (int j = 0; j < res.length; j++) {
					if (i == res[j])
						continue next;
				}
				other[idx++] = i;
			}
			if (count > 2) {
				if (res.length == 1) {
					if (!checkLine(other))
						return;
				} else {
					if (!checkLine(res))
						return;
					if (!checkLine(other))
						return;
				}
			}
			canDiv = true;
			int sumA = 0;
			int sumB = 0;
			for (int i = 0; i < res.length; i++) {
				sumA += origin[res[i]];
			}
			for (int i = 0; i < other.length; i++) {
				sumB += origin[other[i]];
			}
			if (Math.abs(sumA - sumB) < min)
				min = Math.abs(sumA - sumB);
			return;
		}

		for (int i = start; i < count; i++) {
			if (!check[i]) {
				check[i] = true;
				res[cnt] = i;
				com(cnt + 1, i + 1);
				check[i] = false;
			}
		}
	}

	private static boolean checkLine(int[] arr) {
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(arr[0]);
		boolean[] checkCon = new boolean[count];
		for (int i = 0; i < arr.length; i++) {
			checkCon[arr[i]] = true;
		}
		checkCon[arr[0]] = false;
		while (!q.isEmpty()) {
			int n = q.poll();
			if (lineInfo[n] != null) {
				for (int j = 0; j < lineInfo[n].length; j++) {
					if (checkCon[lineInfo[n][j]]) {
						boolean same = false;
						for (int k = 0; k < arr.length; k++) {
							if (lineInfo[n][j] == arr[k])
								same = true;
						}
						if (!same)
							return false;
						checkCon[lineInfo[n][j]] = false;
						q.offer(lineInfo[n][j]);
					}
				}
			}

		}
		for (int i = 0; i < count; i++) {
			if (checkCon[i])
				return false;
		}
		return true;
	}
}

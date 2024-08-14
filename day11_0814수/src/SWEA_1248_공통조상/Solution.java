package SWEA_1248_공통조상;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	static Set<Integer> resLine;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int vCnt = sc.nextInt();
			int lineCnt = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			resLine = new HashSet<>();
			arr = new int[lineCnt][2];
			for (int i = 0; i < lineCnt; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			List<Integer> checkA = new ArrayList<>();
			List<Integer> checkB = new ArrayList<>();
			while (a != 1 || b != 1) {
				for (int i = 0; i < lineCnt; i++) {
					if (a != 1 && arr[i][1] == a) {
						checkA.add(arr[i][0]);
						a = arr[i][0];
					}
					if (b != 1 && arr[i][1] == b) {
						checkB.add(arr[i][0]);
						b = arr[i][0];
					}
				}

			}
			
			int root = 1;
			find: for (int i = 0; i < checkA.size(); i++) {
				for (int j = 0; j < checkB.size(); j++) {
					if (checkA.get(i).equals(checkB.get(j))) {
						root = checkA.get(i);
						break find;
					}
				}
			}
			findCnt(root);
			System.out.println("#" + tc + " " + root + " " + resLine.size());
		}
	}

	private static void findCnt(int start) {
		resLine.add(start);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == start) {
				findCnt(arr[i][1]);
			}
		}

	}

}
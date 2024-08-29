package SWEA_1873_상호의_배틀필드;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char[][] arr = new char[H][W];
			int a = 0;
			int b = 0;
			int way = 0; // 0:상 1:우 2:하 3:좌
			int[][] go = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

			for (int i = 0; i < H; i++) {
				arr[i] = sc.next().toCharArray();
				for (int j = 0; j < W; j++) {
					if (arr[i][j] == '<') {
						a = i;
						b = j;
						way = 3;
					} else if (arr[i][j] == '^') {
						a = i;
						b = j;
						way = 0;
					} else if (arr[i][j] == '>') {
						a = i;
						b = j;
						way = 1;
					} else if (arr[i][j] == 'v') {
						a = i;
						b = j;
						way = 2;
					}
				}
			}
			int cnt = sc.nextInt();
			char[] order = sc.next().toCharArray();
			for (int i = 0; i < cnt; i++) {
				if (order[i] == 'U') {
					way = 0;
					arr[a][b] = '^';
					if (a + go[way][0] < H && b + go[way][1] < W && b + go[way][1] >= 0 && a + go[way][0] >= 0
							&& arr[a + go[way][0]][b + go[way][1]] == '.') {
						arr[a + go[way][0]][b + go[way][1]] = '^';
						arr[a][b] = '.';
						a += go[way][0];
						b += go[way][1];
					}
				} else if (order[i] == 'D') {
					way = 2;
					arr[a][b] = 'v';
					if (a + go[way][0] < H && b + go[way][1] < W && b + go[way][1] >= 0 && a + go[way][0] >= 0
							&& arr[a + go[way][0]][b + go[way][1]] == '.') {
						arr[a + go[way][0]][b + go[way][1]] = 'v';
						arr[a][b] = '.';
						a += go[way][0];
						b += go[way][1];
					}
				} else if (order[i] == 'L') {
					way = 3;
					arr[a][b] = '<';
					if (a + go[way][0] < H && b + go[way][1] < W && b + go[way][1] >= 0 && a + go[way][0] >= 0
							&& arr[a + go[way][0]][b + go[way][1]] == '.') {
						arr[a + go[way][0]][b + go[way][1]] = '<';
						arr[a][b] = '.';
						a += go[way][0];
						b += go[way][1];
					}
				} else if (order[i] == 'R') {
					way = 1;
					arr[a][b] = '>';
					if (a + go[way][0] < H && b + go[way][1] < W && b + go[way][1] >= 0 && a + go[way][0] >= 0
							&& arr[a + go[way][0]][b + go[way][1]] == '.') {
						arr[a + go[way][0]][b + go[way][1]] = '>';
						arr[a][b] = '.';
						a += go[way][0];
						b += go[way][1];
					}
				} else if (order[i] == 'S') {
					int k = 1;
					while (a + go[way][0] * k >= 0 && b + go[way][1] * k >= 0 && a + go[way][0] * k < H
							&& b + go[way][1] * k < W) {
						if (arr[a + go[way][0] * k][b + go[way][1] * k] == '*') {
							arr[a + go[way][0] * k][b + go[way][1] * k] = '.';
							break;
						} else if (arr[a + go[way][0] * k][b + go[way][1] * k] == '#') {
							break;
						}
						k++;
					}
				}

			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();

			}
		}
	}
}
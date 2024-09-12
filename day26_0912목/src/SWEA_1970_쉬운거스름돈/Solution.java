package SWEA_1970_쉬운거스름돈;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] m = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			System.out.println("#" + tc);
			for (int i = 0; i < m.length; i++) {
				System.out.print(N / m[i] + " ");
				N %= m[i];
			}
		}
		System.out.println();
	}

}
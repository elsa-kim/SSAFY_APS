package SWEA_1217_거듭제곱;

import java.util.Scanner;

public class Solution {
	public static int getMul(int num, int cnt) {
		if(cnt==0) return 1;
		return num*getMul(num, cnt-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc<=10; tc++) {
			int t = sc.nextInt();
			int num = sc.nextInt();
			int cnt = sc.nextInt();
			int res = getMul(num, cnt);
			System.out.println("#"+t+" "+res);
		}
	}

}
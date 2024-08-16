package 알고리즘test;

import java.util.Scanner;

public class 신입사원분반교육 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int cnt = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			int ans = max - min;
			int[] list = new int[cnt];
			for (int i = 0; i < cnt; i++) {
				list[i] = sc.nextInt();
			}
			int minS;
			int maxS;
			boolean canDiv = false;
			for (int i = 1; i < 100; i++) {
				for (int j = i + 1; j < 101; j++) {
					minS = i;
					maxS = j;
					int low = 0;
					int middle = 0;
					int high = 0;
					for (int k = 0; k < cnt; k++) {
						if (list[k] <= minS)
							low++;
						else if (list[k] > minS && list[k] < maxS)
							middle++;
						else
							high++;
					}
					if (low >= min && low <= max && middle >= min && middle <= max && high >= min && high <= max) {
						canDiv = true;
						int small = low;
						if (small > middle)
							small = middle;
						if (small > high)
							small = high;
						int large = low;
						if (large < middle)
							large = middle;
						if (large < high)
							large = high;
						if (large - small < ans)
							ans = large - small;
					}
				}

			}
			System.out.println("#" + tc + " " + (canDiv ? ans : -1));
		}
	}

}

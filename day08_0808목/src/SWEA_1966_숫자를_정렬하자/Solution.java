package SWEA_1966_숫자를_정렬하자;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int cnt = sc.nextInt();
			
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			for (int i = 0; i < cnt; i++) {
				queue.offer(sc.nextInt());
			}
			
			System.out.print("#"+tc);
			for(int i=0; i<cnt; i++) {
				System.out.print(" "+queue.poll());
			}
			System.out.println();
		}
	}
}
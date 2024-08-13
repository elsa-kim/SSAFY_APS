package SWEA_1228_암호문1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int size = sc.nextInt();
			LinkedList<Integer> arr = new LinkedList<>();

			for (int i = 0; i < size; i++) {
				arr.add(sc.nextInt());
			}
			String orderStr;
			int idx;
			int cnt;
			int orderCnt = sc.nextInt();
			for (int i = 0; i < orderCnt; i++) {
				Stack<Integer> stack = new Stack<>();
				orderStr = sc.next();
				idx = sc.nextInt();
				cnt = sc.nextInt();
				for(int j=0; j<cnt; j++) {
					stack.push(sc.nextInt());
				}
				for(int j=0; j<cnt; j++) {
					arr.add(idx, stack.pop());
				}
			}
			System.out.print("#"+tc);
			for(int i=0; i<10; i++) {
				System.out.print(" "+arr.get(i));
			}
			System.out.println();
		}
		

	}

}
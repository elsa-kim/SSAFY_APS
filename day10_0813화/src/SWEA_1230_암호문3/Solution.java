package SWEA_1230_암호문3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int size = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			for(int i=0; i<size; i++) {
				arr.add(sc.nextInt());
			}
			int order = sc.nextInt();
			String orderStr;
			int idx;
			int cnt;
			Stack<Integer> stack = new Stack<>();
			for(int i=0; i<order; i++) {
				orderStr = sc.next();
				if(orderStr.equals("I")) {
					idx = sc.nextInt();
					cnt = sc.nextInt();
					for(int j=0; j<cnt; j++) {
						stack.push(sc.nextInt());
					}
					for(int j=0; j<cnt; j++) {
						arr.add(idx, stack.pop());
					}
				}else if(orderStr.equals("D")) {
					idx = sc.nextInt();
					cnt = sc.nextInt();
					for(int j=0; j<cnt; j++) {
						arr.remove(idx);
					}
				}else if(orderStr.equals("A")) {
					cnt = sc.nextInt();
					for(int j=0; j<cnt; j++) {
						arr.add(sc.nextInt());
					}
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
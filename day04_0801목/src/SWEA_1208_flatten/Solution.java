package SWEA_1208_flatten;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int cnt = sc.nextInt();
			int[] arr = new int[100];
			for(int i=0; i<100; i++) {
				arr[i] = sc.nextInt();
			}
			int[] cntArr = new int[100];
			while(cnt>=0) {
				int n = 0;
				for(int i=0; i<arr.length; i++) {
					cntArr[arr[i]-1]++;
				}
				for(int i=1; i<arr.length; i++) {
					cntArr[i]+=cntArr[i-1];
				}
				for(int i=0; i<arr.length; i++) {
					while(n!=cntArr[i]) {
						arr[n++] = i+1;
					}
						
				}
				cntArr = new int[100];
				if(cnt>0) {
					arr[0]++;
					arr[99]--;
				}
				cnt--;
				
			}
			System.out.println("#"+t+" "+(arr[99]-arr[0]));
		}
		
		
	}

}
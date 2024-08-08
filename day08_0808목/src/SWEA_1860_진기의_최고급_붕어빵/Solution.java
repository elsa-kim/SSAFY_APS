package SWEA_1860_진기의_최고급_붕어빵;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int pCnt = sc.nextInt();
			int time = sc.nextInt();
			int cnt = sc.nextInt();
			int[] arr = new int[pCnt];
			int max = 0;
			for(int i=0; i<pCnt; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]>max)max=arr[i];
			}
			int[] cntArr = new int[max+1];
			for(int i=0; i<pCnt; i++) {
				cntArr[arr[i]]++;
			}
			int ppang = 0;
			boolean isPossible = true;
			for(int i=0; i<cntArr.length; i++) {
				if(i!=0&&i%time==0)ppang+=cnt;
				if(cntArr[i]==0) continue;
				ppang-=cntArr[i];
				if(ppang<0) isPossible = false;
			}
			System.out.println("#"+tc+" "+(isPossible?"Possible":"Impossible"));
		}
	}
}
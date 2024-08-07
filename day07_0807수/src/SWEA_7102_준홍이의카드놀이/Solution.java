package SWEA_7102_준홍이의카드놀이;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n+m];
			for(int i=1; i<=n; i++){
				for(int j=1; j<=m; j++){
					arr[i+j-1]++;
				}
				
			}
			
			int max = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max)max=arr[i];
			}
			System.out.print("#"+tc);
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==max) System.out.print(" "+(i+1));
			}
			System.out.println();
		}
	}

}
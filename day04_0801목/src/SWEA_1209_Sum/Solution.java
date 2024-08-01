package SWEA_1209_Sum;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			int max = 0;
			int testNum = sc.nextInt();
			int[][] arr = new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum3 = 0;
			int sum4 = 0;
			for(int i=0; i<100; i++) {
				int sum1 = 0;
				int sum2 = 0;
				sum3+=arr[i][i];
				sum4+=arr[99-i][i];
				for(int j=0; j<100; j++) {
					sum1+=arr[i][j];
					sum2+=arr[j][i];
					
				}
				if(sum1>max) max=sum1;
				if(sum2>max) max=sum2;
				
			}
			if(sum3>max) max=sum3;
			if(sum4>max) max=sum4;
			System.out.println("#"+testNum+" "+max);
		}
	}

}
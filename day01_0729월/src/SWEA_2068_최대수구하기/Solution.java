package SWEA_2068_최대수구하기;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int max = 0;
            int[] arr = new  int[10];
            for(int i=0; i<arr.length; i++){
            	arr[i] = sc.nextInt();
            }
            for(int i=0; i<arr.length; i++){
            	if(arr[i] > max) max = arr[i];
            }
            System.out.println("#"+test_case+" "+max);
		}
	}
}
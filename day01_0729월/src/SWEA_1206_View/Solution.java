package SWEA_1206_View;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		 int T;
		for(int test_case = 1; test_case <= 10; test_case++){
	        int cnt=0;
			T=sc.nextInt();
	        int[] intArray = new int[T];
	        for (int i = 0; i<T; i++){
	        	intArray[i] = sc.nextInt();
	        }
	        for (int i = 2; i<T-2; i++){
	            int min = 0;
	        	int a = intArray[i]-intArray[i-1];
	            int b = intArray[i]-intArray[i-2];
	        	int c = intArray[i] - intArray[i+1];
	        	int d = intArray[i] - intArray[i+2];
	       	 	min = Math.min(a, b);
	            min = Math.min(min, c);
	            min = Math.min(min, d);
	            if (min>0){
	                cnt+= min;
	            }
	        }
	        System.out.println("#"+test_case+" "+cnt);
		}
	
	}
}
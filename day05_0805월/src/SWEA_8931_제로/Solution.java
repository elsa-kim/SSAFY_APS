package SWEA_8931_제로;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int size = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			int n = 0;
			for(int i=0; i<size; i++) {
				n=sc.nextInt();
				if(n!=0) {
					arr.add(n);
				}else {
					arr.remove(arr.size()-1);
				}
				
			}
			
			int sum = 0;
			for(int i=0; i<arr.size(); i++) {
				sum+=arr.get(i);
			}
			System.out.println("#"+tc+" "+sum);
			
		}
	}

}
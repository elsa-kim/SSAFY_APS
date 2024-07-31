package SWEA_1213_String;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int t =sc.nextInt();
			String word = sc.next();
			String[] wordArr = word.split("");
			String full = sc.next();
			String[] fullArr = full.split("");
			
			int cnt = 0;
			
			for(int i=0; i<fullArr.length; i++) {
				if(fullArr[i].equals(wordArr[0]) && i+wordArr.length<=fullArr.length) {
					boolean canAdd = true;
					for(int j=1; j<wordArr.length; j++) {
						if(!fullArr[i+j].equals(wordArr[j])) canAdd = false;
					}
					if(canAdd) {
						cnt++;
					}
				}
			}
			System.out.println("#"+test_case+" "+cnt);
		
		}
	}
}
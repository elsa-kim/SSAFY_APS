package SWEA_1222_계산기1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int size = sc.nextInt();
			String str = sc.next();
			String[] strArr = str.split("");
			List<Integer> arr = new ArrayList<>();
			for(int i=0; i<size; i++) {
				if(strArr[i].equals("+")) continue;
				arr.add(Integer.parseInt(strArr[i]));
			}
			int sum = 0;
			while(arr.size()>0) {
				sum+=arr.remove(arr.size()-1);
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
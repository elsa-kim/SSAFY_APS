package SWEA_1225_암호생성기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1; tc<=10; tc++) {
			int t = sc.nextInt();
			List<Integer> arr = new ArrayList<>();
			for(int i=0; i<8; i++) {
				arr.add(sc.nextInt());
			}
			
			while(arr.get(7)>0) {
				for(int i=1; i<=5; i++) {
					arr.add(arr.remove(0)-i);
					if(arr.get(7)<=0) break;
				}
			}
			arr.remove(7);
			arr.add(0);
			System.out.print("#"+tc+" ");
			for(int i=0; i<8; i++) {
				System.out.print(arr.get(i));
				if(i!=7) System.out.print(" ");
			}
			System.out.println();
		}
	}
}
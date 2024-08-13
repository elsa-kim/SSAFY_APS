package SWEA_1954_달팽이숫자;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int size = sc.nextInt();
			int[][] arr = new int[size][size];
			
			int way = 0;
			int[][] wayArr = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
			
			int a = -1;
			int b = 0;
			int n = 1;
			while(n<=size*size) {
				a+=wayArr[way][0];
				b+=wayArr[way][1];
				if(a==size||b==size||a<0||b<0||arr[a][b]!=0) {
					a-=wayArr[way][0];
					b-=wayArr[way][1];
					way = (way+1)%4;
					a+=wayArr[way][0];
					b+=wayArr[way][1];
					
				}
				arr[a][b] = n++;
			}
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}

}

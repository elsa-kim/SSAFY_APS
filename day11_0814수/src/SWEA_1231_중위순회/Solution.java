package SWEA_1231_중위순회;

import java.util.Scanner;

public class Solution {
	static String[] text;
	static int[][] line;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc<=10; tc++) {
			int cnt = sc.nextInt();
			text = new String[cnt+1];
			line = new int[cnt+1][];
			
			for(int i=0; i<cnt; i++) {
				int idx = sc.nextInt();
				String str = sc.nextLine();
				text[idx]= str.substring(1, 2);
				if(str.length()>2) {
					line[idx] = new int[str.split(" ").length-2];
					for(int j=0; j<line[idx].length; j++) {
						line[idx][j] = Integer.parseInt(str.split(" ")[j+2]);
					}
				}
			}
			System.out.print("#"+tc+" ");
			dfs(1);
			System.out.println();
		}
	}

	private static void dfs(int idx) {
		if(line[idx] != null) {
			dfs(line[idx][0]);
		}
		System.out.print(text[idx]);
		if(line[idx] != null && line[idx].length==2) {
			dfs(line[idx][1]);
		}
		
	}

}
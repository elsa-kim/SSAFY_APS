package 정렬;

import java.util.Arrays;

public class 퀵정렬 {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 8, 9, 10, 14 };
		arr = quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] quickSort(int[] arr) {
		int pivot = arr[0];
		int lCnt = 0;
		int rCnt = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > pivot)
				rCnt++;
			else if (arr[i] < pivot)
				lCnt++;
		}

		int[] lArr = new int[lCnt];
		int[] rArr = new int[rCnt];
		for (int i = 1, lIdx = 0, rIdx = 0; i < arr.length; i++) {
			if (arr[i] > pivot)
				rArr[rIdx++] = arr[i];
			else if (arr[i] < pivot)
				lArr[lIdx++] = arr[i];
		}
		if (lCnt > 1) {
			lArr = quickSort(lArr);
		}
		if (rCnt > 1) {
			rArr = quickSort(rArr);
		}

		for (int i = 0, lIdx = 0, rIdx = 0; i < arr.length; i++) {
			if (i == lCnt)
				arr[i] = pivot;
			else if (i < lCnt)
				arr[i] = lArr[lIdx++];
			else
				arr[i] = rArr[rIdx++];
		}

		return arr;
	}
}

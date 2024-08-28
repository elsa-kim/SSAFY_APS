package 정렬;

import java.util.Arrays;

public class 병합정렬 {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 8, 9, 10, 14 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] array) {
		if (array.length == 1)
			return array;
		int[] arr1 = Arrays.copyOf(array, array.length / 2);
		int[] arr2 = Arrays.copyOfRange(array, array.length / 2, array.length);
		
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		
		// merge
		int idx1 = 0;
		int idx2 = 0;
		int idx = 0;
		while (idx != array.length) {
			if (idx1 == arr1.length) {
				array[idx++] = arr2[idx2++];
			} else if (idx2 == arr2.length) {
				array[idx++] = arr1[idx1++];
			} else if (arr1[idx1] < arr2[idx2]) {
				array[idx++] = arr1[idx1++];
			} else {
				array[idx++] = arr2[idx2++];
			}
		}
		return array;
	}
}

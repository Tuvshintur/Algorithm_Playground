package sort;

import java.util.Arrays;

public class SelectionSort implements Sort {

	public int[] arr;

	public SelectionSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int nextMinPos = minPos(i, length - 1);
			swap(i, nextMinPos);
		}
	}

	public void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public int minPos(int bottom, int top) {
		int m = arr[bottom];
		int index = bottom;
		for (int i = bottom; i <= top; i++) {
			if (arr[i] < m) {
				m = arr[i];
				index = i;
			}
		}
		return index;
	}

	public String toString() {
		return Arrays.toString(arr);
	}
	
}

/*
 * Let's say we have array [ 6, 9, 8, 10, 1, 2 ]
 * 
 * +
 * 
 */

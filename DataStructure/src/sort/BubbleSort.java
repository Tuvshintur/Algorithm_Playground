package sort;

import java.util.Arrays;

public class BubbleSort implements Sort {

	int[] arr;
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			boolean isSwapped = false;
			//length - i - 1 => for each i iteration the most high number swapped to the right.
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
					isSwapped=true;
				} 
			}
			//if isSwapped equals false which means it has no swap happened so array is sorted. 
			if(!isSwapped) {
				break;
			}
		}
	}

	public void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
}

/*
 * Let's say we have array [4, 3, 2]
 * i=0; j=0;
 * arr[j] > arr[j+1] => 4>3 =>swap [3,4,2]
 * i=0; j=1;
 * arr[j] > arr[j+1] => 4>2 => swap [3,2,4]
 * i=1; j=0;
 * arr[j] > arr[j+1] => 3>2 => swap [2,3,4] 
 * i=1; j=1;
 * arr[j] > arr[j+1] => 3>4 => no swap [2,3,4]
 * i=2; j=0;
 * arr[j] > arr[j+1] => 2>3 => no swap [2,3,4]
 * i=2; j=1;
 * arr[j] > arr[j+1] => 3>4 => no swap [2,3,4]
 * 
 * Time Complexity = O(n^2) in every case if we did not consider i iteration, since we got that implementation we might have O(n) in some cases;
 * Space Complexity = O(1)
 */
package sort;

/**
 * @author tuvsh
 *
 */
public class Application {

	public static BubbleSort bubbleSort = new BubbleSort(new int[] { 6, 9, 8, 10, 1, 2 });
	public static SelectionSort selectionSort = new SelectionSort(new int[] { 6, 9, 8, 10, 1, 2 });

	public static void main(String[] args) {
		bubbleSort.sort();
		System.out.println(bubbleSort.toString());
		selectionSort.sort();
		System.out.println(selectionSort.toString());
	}
}

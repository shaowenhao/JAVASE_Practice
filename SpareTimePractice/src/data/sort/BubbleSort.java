package data.sort;

import java.util.Arrays;

// BubbleSort and QuickSort were JiaoHuan Pai Xu
public class BubbleSort {

	public static void main(String[] args) {
		int[] arry = new int[] {2,5,3,3,1,4};
		System.out.println(Arrays.toString(arry));
		bubbleSort(arry);
		System.out.println(Arrays.toString(arry));
	}

	public static void bubbleSort(int[] arry) {

		for (int i = 0; i < arry.length-1; i++) {
			for (int j = 0; j < arry.length-1-i; j++) {
				if (arry[j] > arry[j+1]) {
					int temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;

				}
			}

		}
	}

}

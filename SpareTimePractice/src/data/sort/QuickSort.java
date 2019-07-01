package data.sort;

import java.util.Arrays;

//BubbleSort and QuickSort were JiaoHuan Pai Xu
public class QuickSort { // It's recursive issue!! find standard low and high

	public static void main(String[] args) {
		int[] arry = new int[] { 3, 4, 6, 7, 2, 7, 2,8,};

		quickSort(arry, 0, arry.length-1);
		System.out.println(Arrays.toString(arry));
	}

	public static void quickSort(int[] arry, int start, int end) {
		int standard = arry[start];
		
		int low = start;
		int high = end;
	
		if (start < end) {  // condition: out of recursive 
			while (low < high) {
				while (low < high && standard <= arry[high] ) {
					high--;
				}
				arry[low] = arry[high];
				while (low < high && arry[low] <= standard) {
					low++;
				}
				
				arry[high] = arry[low];
			}
			// low = high now, standard put back 
			arry[low] = standard;
			quickSort(arry, start, low);
			quickSort(arry, low+1, end);
		}

	}

}

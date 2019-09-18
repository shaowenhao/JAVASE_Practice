package data.basic.chapter4;

import java.util.Arrays;

public class ArrayInterview {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		arrayReverse(array);

	}

	public static void arrayReverse(int[] array){
		int length = array.length;
		for(int i=0; i<length/2; i++) {
			int temp = array[i];
			array[i] = array[length-i-1];
			array[length-i-1] = temp;
		}
		System.out.println(Arrays.toString(array)); 
	}
}

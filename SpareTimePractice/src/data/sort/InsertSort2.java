package data.sort;

import java.util.Arrays;

public class InsertSort2 {

	public static void main(String[] args) {
	 int [] array = new int[] {2,8,3,5,7};
     InsertSort2.insertSort(array);
     System.out.println(Arrays.toString(array));
	}
    public static void insertSort(int[] array) {
    	for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j=i;  // xiabiao baocun qilai
			while(j>0 && array[j-1]>temp) {
				// shangmian de shu  fugai xiaomian de shu
				
				array[j] = array[j-1];
				j--;
			}
			//cha ru shuju
			array[j] = temp;
		}
    }
}

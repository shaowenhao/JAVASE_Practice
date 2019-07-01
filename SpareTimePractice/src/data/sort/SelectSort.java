package data.sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] nums = {3,2,6,4,7,7,1};
		SelectSort.selectSort(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void selectSort(int[] nums) {
		//Bian li suoyou shu
		for (int i = 0; i < nums.length; i++) {
			int minIndex = i;
			//Ba dangqian bianlideshu he houian suoyou d shu yici bijiao,jilu zuixiao shu xia biao
			for (int j = i+1; j < nums.length; j++) {
				// Ruguo houmian de shu bi jilu de zuixiao de shu xiao
				if (nums[minIndex]>nums[j]) {
					// JilU zuixiao shu xiabiao
					minIndex = j;
				}
			}
			//Riguo zuixiaode shu he dangqian bianli de shu xiaobiao buyizhi 
			if (i!=minIndex) {
				int temp =nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
			}
		}
	}
}

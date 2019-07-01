package data.sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] nums = {3,2,6,4,7,7,1};
		InsertSort.insertSort(nums);
		System.out.println(Arrays.toString(nums));
	} 


	public static void insertSort(int[] nums) {
		// Bian Li cong di er ge yuansu kaishi de houmian suoyou yuan su
		for (int i = 1; i < nums.length; i++) {
			// Ru Guo dangqian shuzi bi qianyigeshu xiao
			if(nums[i]<nums[i-1]) {
				// ba dangqian bianli shuzi cunqilai
				int temp = nums[i];
				int j;
				// Bian li dangqian shuzi qianmian suoyou shuzi
				for(j=i-1;j>=0&& temp<nums[j];j--) {
					//Ba qianyige shuzi fugei houyge shuzi
					nums[j+1] = nums[j];
				}
				// J wang qian yigeshu
				nums[j+1] = temp;
			}
		}
	}
}

package data.sort;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {
		int[] array = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
		RadixSort.radixSort(array);
		System.out.println(Arrays.toString(array));
	}

	
	public static  void radixSort(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}			
		}
		System.out.println(max);
		//jisuan zuida shuzi shi jiweishu
		int maxLength = (max + "").length();
		System.out.println(maxLength);
		
		//yong yu linshi cunfang shuju de shuzu 
		int[][] temp = new int[10][array.length];
		
		//yongyu jilu zai temp zhong ,xiangying de shuzuzhong cunfangde shuzi de shuliang 
		int[] counts = new int[10];
		
		// genju zuidao changdu jueding bijiao cishu
		for (int i = 0,n=1; i < maxLength; i++,n*=10) {
			// meige shuzi fenbie jiesuan yushu
			for (int j = 0; j < array.length; j++) {
			  int ys=	array[j]/n%10;
			  //ba dangqian bianlide shuju fangdao zhiding shuzuzhong
			  temp[ys][counts[ys]] = array[j];
			  //jilu shuliang
			  counts[ys]++;
			}
//			if (i==0) {
//				for(int[] num:temp) {
//					System.out.println(Arrays.toString(num));
//				}				
//			}
			
			int index=0;
			// ba shuzi quchulai
			for (int k = 0; k < counts.length; k++) {
				//jilu shuliang de shuzu zhong yushu buwei 0
				if (counts[k]!=0) {
					// xun huan quchu yuansu 
					for (int l = 0; l < counts[k]; l++) {
					array[index]=temp[k][l];
					// jilu xiayige weizhi
					index++;
					}
					//ba shuliang zhiwei 0
					 counts[k] = 0;
				}
			}
		}

		//jilu qu de yuansu xuyao fangde weizhi

	}
}

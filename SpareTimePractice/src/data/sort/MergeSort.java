package data.sort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
	  int[] arry = new int[]{1,3,4,2,4,6,8,10};
	//  merge(arry, 0, 2, arry.length-1);
	  MergeSort.mergeSort(arry, 0, arry.length-1);
	  System.out.println(Arrays.toString(arry));
 }
  
  public static void mergeSort(int[] arry, int low, int high) {
	  int middle = (low+high)/2;
	  if (low<high) {
		  mergeSort(arry, low, middle);
		  mergeSort(arry, middle+1, high);
		  merge(arry, low, middle, high);
	}
	
  }
  
  public static void merge(int[] arry, int low,int middle, int high) {
	 // Yong yu cunfang guibing houde lingshi suzu
	  int[] temp = new int[high-low+1];
	  // jilu diyige shuzu xuyao bianli de xiabiao
	  int i = low;
	   // jilu dierge shuzu de xiabiao
	  int j = middle+1;
	  // yongyu ji lu zai lingshi shuzu zhongde xiabiao
	  int index = 0;
	  // Bianli xiangge shuzu quchu xiaode shuzi, fangru lingshi shuzu
	  while(i<=middle && j<=high) {
		  if (arry[i]<arry[j]) {
			temp[index] = arry[i];
			i++;
		}else {
			temp[index] = arry[j];
			j++;
		}
		  index++;
	  }
	  // chuli duoyu de shuju
	  while(j<=high) {
		  temp[index]=j;
		  j++;
		  index++;
	  }
	  while(i<=middle) {
		  temp[index]=i;
		  i++;
		  index++;
	  }
	  // Ba lingshi zuzhu shuju fangru yuan shuzu
	  for (int k = 0; k < temp.length; k++) {
		arry[k+low]  = temp[k];
	 }
   }
}

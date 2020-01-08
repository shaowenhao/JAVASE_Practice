package data.basic.chapter4;

import java.util.Arrays;

public class StringInterview {

	public static void main(String[] args) {
//		
//       String str = "abac";
//       System.out.println(StringInterview.isHuiwen(str)); 
//       
//       System.out.println(StringInterview.isHuiwen2(str));
//       
//       String s = "abcaada";
//       System.out.println(Arrays.toString(s.split("a")));
       
//       int[] arrays = new int[] {0, 0, 1, 1, 1, 0, 1, 0, 0, 1};
//       transfer(arrays);
		
//	      char[] chars = new char[]{'1', '*', '4', '3', '*', '5', '*','6','*'};
//	      starTransfer(chars);
		String input = "I am a student";
		stringReverse(input);
		
	}

	public static boolean isHuiwen(String str) {
		if(str==null)
			return false;
		StringBuilder sbBuilder= new StringBuilder(str);
		String reverse_str = sbBuilder.reverse().toString();
		return str.equals(reverse_str);
	}
	
	public static boolean isHuiwen2(String str) {
		if(str==null)
			return false;
		int length = str.length();
		for(int i=0;i<length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-i-1))
				return false;
			
		}
		return true;
	}
	
	public static void transfer(int[] arrays) {
		int count = 0;
		int left = 0;
		int right = arrays.length -1;
		while(true) {
			while(arrays[left]==0) {
				left++;
			}
			while(arrays[right]==1) {
				right--;
			}
			if(left>=right) {
				break;
			}else {
				int temp = arrays[left];
				arrays[left] = arrays[right];
				arrays[right] = temp;
				count++;
			}
		}
		System.out.println("Count:" +count);
		System.out.println(Arrays.toString(arrays));  
	}
	
	public static void starTransfer(char[] chars) {
		// 1 * 2 * 4 * 3 => * * * 1 2 4 3
		
	      // 方案一（操作后，数字的相对位置不变）
		 // 倒着操作：从最大下标开始向前遍历，遇到非*号的元素则加入"新"下标中，遍历完毕后，j即代表*号的个数，然后将0-j赋值为*即可。
		int j = chars.length - 1;
		for(int i = j; i>= 0 ;i--) {
			if(chars[i] != '*') {
				chars[j--] = chars[i];
			}
		}
		while(j>=0) {
			chars[j--] = '*';
		}
		
        System.out.println(Arrays.toString(chars));  
	}
	
	
	public static void stringReverse(String str) {
		 // String input = "I am a student";
		 StringBuilder sb= new StringBuilder(str);
		 String strAfterReverse2 = sb.reverse().toString();
		 
		 String[] strs = strAfterReverse2.split(" ");
		 for(int i=0; i<strs.length;i++) {
			 StringBuilder sb2 = new StringBuilder(strs[i]);
			 StringBuilder strReverse = sb2.reverse();
			 String ecpectStr = strReverse.toString();
			 System.out.print(ecpectStr + " ");
		 }
	}
}


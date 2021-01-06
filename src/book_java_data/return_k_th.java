package book_java_data;

import java.util.Arrays;

public class return_k_th {
	static int i;
		public static void main(String[] args) {
			int[] arr = new int[] {3,4,2,5,7,1,8,0,10,6,12,15};
			int k = getMax(arr, 9);
			System.out.println("前K-1个降序排列的值为："+k);
		}
		
		
		public static int getMax(int[] arr, int k) {
			Arrays.sort(arr);
			int n = arr.length;
			return arr[n-k];
		}
}

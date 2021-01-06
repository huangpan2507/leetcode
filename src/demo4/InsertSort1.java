package demo4;

import java.util.Arrays;

public class InsertSort1 {
	
	

	public static void main(String[] args) {
		int[] arr = new int[]{5,3,2,8,5,9,1,0};
		System.out.println("初始待排序数组:"+Arrays.toString(arr));
		int[] newarr = insertSort(arr);
		System.out.println("排序结束后的数组:"+Arrays.toString(newarr));
		
	}
	
	public static int[] insertSort(int[] arr) {
		//遍历所有数字
		for(int i = 1; i<arr.length; i++) {
			//如果后面比前面大
			if(arr[i-1] > arr[i]) {
				//取出当前值(因为较小)
				int temp = arr[i];
				int j;
				//遍历当前值之前的数，如果比 取出的较小当前值还小，则将当前值之前的数赋值给当前值，直至走到了第一个数
				for (j =i-1; j>=0&&temp<arr[j];j--) {
					arr[j+1] = arr[j];
				}
				//发现遍历到只有第一个数的位置，则将当前值赋值给第一个数，即找到最小的数
				arr[j+1] = temp;
			
			}
			
		}
		return arr;		
					
	}

}

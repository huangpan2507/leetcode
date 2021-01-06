package demo3;

import java.util.Arrays;

public class TestQuickSort1 {
	
	static int x = 0;
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,4,2,5,7,1,8,0};
		System.out.println("排序前的数组为："+ Arrays.toString(arr));
		////int[] newarr = bubbleSort(arr);
		int[] newarr = quickSort(arr, 0, arr.length-1);
		System.out.println("快速排序比较"+x+ ""+"次后的数组为："+ Arrays.toString(newarr));
	}
	
	
	public static int[] bubbleSort(int[] arr) {
		for(int i = 1; i<=arr.length;i++) {
			for(int j = 0; j< arr.length-i; j++) {
				System.out.println("j="+ j);
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				System.out.println("i="+ i);
				
				
				x++;
			} 
			
		}
		return arr;
	}
	
	
	public static int[] quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int in = arr[left];
			int low = left;
			int high = right;
			
			while(low< high) {
				while(low<high&&arr[high]>= in) {
					System.out.println("下标左移");
					
					high--;
					
				}
				
				arr[low]= arr[high];
				System.out.println("右边:"+arr[high]+"比基准值:"+ in+"小"+ ",把小的放左边>>"+Arrays.toString(arr));
				System.out.println("交换值后，看左边:"+ "low:"+ low+ "\\	high:"+high);
				while(low<high && arr[low] < in) {
					System.out.println("下标右移");
					low++;
				}
				
				arr[high] = arr[low];
				System.out.println("右边:"+arr[high]+"比基准值:"+ in+"大"+ ",把大的放右边>>"+Arrays.toString(arr));
				System.out.println("交换值后，看右边:"+ "low:"+ low+ "\\	high:"+high);
			}
			System.out.println("当两个下标重合后，把基准值放在重合下标位置,第一趟比较完毕");
			arr[low] = in;
			x++;
			System.out.println("在基准值左边 递归");
			quickSort(arr, left, low-1);
			System.out.println("在基准值右边 递归");
			quickSort(arr, low+1, right);
			
		}
		return arr;
	}
		
	
}

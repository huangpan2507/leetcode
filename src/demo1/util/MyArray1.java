// 自己复写/改写的代码
package demo1.util;

import java.util.Arrays;

public class MyArray1 {
	
	//用于保存数据的数组
	private int[] elements;
	
	public  MyArray1() {
		elements = new int[0] ;
	}
	
	// 获取数组长度的方法
	public int size() {
		return elements.length;
	}
	
	
	// 往数组的末尾添加一个元素
	public void add(int element) {
		//创建一个新数组
		int[] newarr = new int[elements.length+1];
		//把原有数组内容复制到新数组中
		for(int i =0; i< elements.length; i++) {
			newarr[i] = elements[i];
			
		}
		newarr[elements.length] = element;
		//使用新数组替换旧数组
		elements = newarr;
		
	}
	
	// 打印所有元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	// 删除数组中某下标的元素
	public void delete(int index) {
		//判断下标是否越界
		if(index < 0 || index > elements.length -1) {
			throw new RuntimeException("下标越界");
		} else {
			int[] newarr = new int[elements.length -1];
			//下面 i的循环结束，容易写成是删除前的长度，会造成溢出，index=length！
			for (int i=0; i<newarr.length;i++) {
				if(i< index) {
					newarr[i] = elements[i];
				} else {
					newarr[i] = elements[i + 1];
				}
				
			}
			elements = newarr;
		}	
	}
	
	public void check(int index) {
		if (index < 0 || index >elements.length ) {
			throw new RuntimeException("下标越界");
		}
	}
	
	// 取出指定位置的元素
	public int get(int index) {
		check(index);
		return elements[index];
	}
	
	// 插入一个元素到指定位置
	public void insert(int index, int element) {
		//判断下标是否越界
		check(index);
		//创建新数组
		int[] newarr = new int[elements.length + 1];
		for(int i=0; i < elements.length; i++) {
			if (i< index) {
				newarr[i] = elements[i];
			} else {
				newarr[i + 1] = elements[i];
			}
		}
		newarr[index] = element;
		elements = newarr;
	}
	
	
	// 替换指定位置的元素
	public void set(int index, int element) {
		check(index);
		elements[index] = element;
		
	}
	//线性查找
	public int search(int target) {
		int index = -1;
		for (int i =0; i < elements.length;i++) {
			if(elements[i] == target) {
				index = i;
			} 	
		}
		return index;
	}
	
	
	//二分法查找,前提条件是 数组已经排好序
	public int binarySearch(int target) {
		int begin = 0;
		int end = elements.length -1;
		int mid = (begin + end)/2;
		
		
		for (int i = 0; i < elements.length; i++) {
			// 一直找，什么时候说明元素不存在?
			// 当end 都等于 或者小于 begin时，说明不存在该元素
			// 不加下面的话，若查找没有的元素，也发现不了异常
			if (begin >= end) {
				return -1;
			}
			
			
			if(elements[mid] == target) {
				return mid;
			} else {
				if (target < elements[mid]) {
					end = mid - 1;
				} else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
			
		}
		return mid;
	}
}

package demo2;

import java.util.Arrays;

public class MyQueue1 {
	//创建队列
	int[] elements;
	
	public MyQueue1() {
		
		elements = new int[0];
		
	}
	
	
	//入队
	public void add(int element) {
		//创建新数组
		int[] newarr = new int[elements.length + 1];
		
		for (int i = 0; i< elements.length; i ++) {
			newarr[i] = elements[i];
			
		}
		//在队列末尾增加新数值
		newarr[elements.length] = element;
		elements = newarr;
	}
	
	
	//出队
	public int poll() {
		// 出栈是出第一个元素
		int element = elements[0];
		
		//构建新数组用来复制数据
		int[] newarr = new int[elements.length - 1];
		
		//循环多少次呢？ 此处需要明确一点，你想复制多少次取决于，你最终想构建多长的数组，
		//此处你想构建的是pool后长度减1的数组，所以你应该循环你最终长度的次数
		
		for(int i =0; i<newarr.length; i++) {
			newarr[i] = elements[i + 1];
		}
		elements = newarr;
		return element;
	}
	
	
	//判断队列是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
	
	
	//用于显示数组内容
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	

}
